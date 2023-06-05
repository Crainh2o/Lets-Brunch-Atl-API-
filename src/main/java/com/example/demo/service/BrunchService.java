package com.example.demo.service;

import com.example.demo.model.BrunchPlaces;
import com.example.demo.repository.BrunchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class BrunchService {

    private BrunchRepository brunchRepository;

    @Autowired
    public BrunchService(BrunchRepository brunchRepository) {
        this.brunchRepository = brunchRepository;
    }

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

    public void aListOfRestaurantsExist() {
        try {
            ResponseEntity<String> response = new RestTemplate().exchange(BASE_URL + port + "/api/brunchPlaces/", HttpMethod.GET, null, String.class);
            List<?> brunchPlaces = JsonPath.from(String.valueOf(response.getBody())).get();
            Assert.assertEquals(response.getStatusCode(), HttpStatus.OK); // status 200
            Assert.assertTrue(brunchPlaces.size() > 0);
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
        }

        public void userSearchByPriceRange () {
            RestAssured.baseURI = BASE_URL;
            Optional<BrunchPlaces> menu1 = brunchRepository.findById(1L);
            RequestSpecification request = RestAssured.given();
            request.header("Content-Type", "application/json");
            response = request.get(BASE_URL + port + "/api/brunchPlaces/1");
        }

        public void thenUserSeeBrunchRestaurants () {
            Assert.assertEquals(200, response.getStatusCode());
        }
    }
}

