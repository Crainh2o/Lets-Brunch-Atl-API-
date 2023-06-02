package definitions;

import com.example.demo.LetsBrunchInAtlantaApplication;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.junit.Assert;
import java.util.List;


@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = LetsBrunchInAtlantaApplication.class)
public class SpringBootTestDefinitions {
    private static final String BASE_URL = "http://localhost:";

    @LocalServerPort
    String port;

    private static Response response;

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
}


