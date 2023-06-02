package definitions;

import com.example.demo.LetsBrunchInAtlantaApplication;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = LetsBrunchInAtlantaApplication.class)
public class SpringBootTestDefinitions {
    @Given("A list of Brunch Restaurants near my location")
    public void aListOfBrunchRestaurantsNearMyLocation() {
        List<String> brunchPlaces = getBrunchPlacesNearby();
        for (String places : brunchPlaces) {
            System.out.println(brunchPlaces);
        }
    }

    private List<String> getBrunchPlacesNearby() {
        List<String> brunchPlaces = new ArrayList<>();

        brunchPlaces.add("Sunday Brunch Atl");
        brunchPlaces.add("Breakfast At Barney's");
        brunchPlaces.add("Atlanta Breakfast Club");

        return brunchPlaces;
    }

    @Given("A list of restaurants exist")
    public void aListOfRestaurantsExist() {
    }
}
