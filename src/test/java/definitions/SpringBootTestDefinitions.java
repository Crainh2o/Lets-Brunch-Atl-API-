package definitions;

import com.example.demo.LetsBrunchInAtlantaApplication;
import com.example.demo.model.BrunchPlaces;
import com.example.demo.model.Menu;
import com.example.demo.repository.BrunchRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.junit.Assert;
import java.util.List;
import java.util.Optional;


@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = LetsBrunchInAtlantaApplication.class)
public class SpringBootTestDefinitions {
    private static final String BASE_URL = "http://localhost:";

    @LocalServerPort
    String port;

    private static Response response;

    private Menu menu;

    private BrunchRepository brunchRepository;

    @Given("A list of Brunch Restaurants near my location")
    public void aListOfBrunchRestaurantsNearMyLocation() {
        try {
            // http://localhost:RANDOM_PORT/api/books/
            ResponseEntity<String> response = new RestTemplate().exchange(BASE_URL + port + "/api/brunchPlaces/", HttpMethod.GET, null, String.class);
            List<?> brunchPlaces = JsonPath.from(String.valueOf(response.getBody())).get();
            Assert.assertEquals(response.getStatusCode(), HttpStatus.OK); // status 200
            Assert.assertTrue(brunchPlaces.size() > 0);
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }
    }

    @Given("A list of restaurants exist")
    public void aListOfRestaurantsExist() {
        try {
            ResponseEntity<String> response = new RestTemplate().exchange(BASE_URL + port + "/api/brunchPlaces/", HttpMethod.GET, null, String.class);
            List<?> brunchPlaces = JsonPath.from(String.valueOf(response.getBody())).get();
            Assert.assertEquals(response.getStatusCode(), HttpStatus.OK); // status 200
            Assert.assertTrue(brunchPlaces.size() > 0);
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }
        
        
    }

    @When("User search by price range")
    public void userSearchByPriceRange() {
        RestAssured.baseURI = BASE_URL;
        Optional<BrunchPlaces> menu1 = brunchRepository.findById(1L);
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.get(BASE_URL + port + "/api/brunchPlaces/1");
    }

    @Then("then user see brunch restaurants")
    public void thenUserSeeBrunchRestaurants() {
        Assert.assertEquals(200, response.getStatusCode());
    }
}
    






