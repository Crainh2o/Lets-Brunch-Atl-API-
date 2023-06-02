package definitions;

import com.example.demo.LetsBrunchInAtlantaApplication;
import com.example.demo.model.BrunchPlaces;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    public List<String> aListOfRestaurantsExist() {
        List<String> brunchPlaces = new ArrayList<>();

        brunchPlaces.add("Sunday Brunch Atl");
        brunchPlaces.add("Breakfast At Barney's");
        brunchPlaces.add("Atlanta Breakfast Club");

        return brunchPlaces;

    }

    @When("User search by cuisine")
    public void userSearchByCuisine() {
        String cuisine = "Soul Food";
        List<String> brunchPlacesNearby = getBrunchPlacesNearby();
        if (getBrunchPlacesNearby().isEmpty()) {
            System.out.println("No restaurants found for cuisine: " + cuisine);
        } else {
            System.out.println("Restaurants for cuisine: " + cuisine);
            for (String brunchPlaces : getBrunchPlacesNearby()) {
                System.out.println(brunchPlaces);
            }
        }

    }

    @Then("then user see brunch restaurants")
    public List<String> thenUserSeeBrunchRestaurants() {
        List<String> brunchPlaces = new ArrayList<>();

        brunchPlaces.add("Sunday Brunch Atl");
        brunchPlaces.add("Breakfast At Barney's");
        brunchPlaces.add("Atlanta Breakfast Club");

        return brunchPlaces;

    }

    @When("User search by price range")
    public <Restaurant> void userSearchByPriceRange() {
        int minPrice = 0;
        int maxPrice = 0;
        List<String> matchingRestaurants = getRestaurantsByPriceRange(minPrice, maxPrice);

        // Printing the matching restaurants
        if (matchingRestaurants.isEmpty()) {
            System.out.println("No restaurants found within the price range: $" + minPrice + " - $" + maxPrice);
        } else {
            System.out.println("Restaurants within the price range: $" + minPrice + " - $" + maxPrice);
            for (String restaurant : matchingRestaurants) {
                System.out.println(restaurant.length());
            }
        }
    }

    public static <Restaurant> List<Restaurant> getRestaurantsByPriceRange(int minPrice, int maxPrice) {
        // Simulating the retrieval of restaurants within the price range
        List<Restaurant> matchingRestaurants = new ArrayList<>();

        // Simulated restaurant data
        List<Restaurant> allRestaurants = getRestaurantList();

        for (Restaurant restaurant : allRestaurants) {
            boolean price = restaurant.equals(getRestaurantsByPriceRange(minPrice, maxPrice));
        }

        return matchingRestaurants;
    }

    private static <Restaurant> List<Restaurant> getRestaurantList() {
        List<String> brunchPlaces = new ArrayList<>();

        brunchPlaces.add("Sunday Brunch Atl");
        brunchPlaces.add("Breakfast At Barney's");
        brunchPlaces.add("Atlanta Breakfast Club");

        return (List<Restaurant>) brunchPlaces;
    }


}

