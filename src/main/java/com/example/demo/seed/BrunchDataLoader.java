package com.example.demo.seed;

import com.example.demo.model.BrunchPlaces;
import com.example.demo.model.Menu;
import com.example.demo.repository.BrunchRepository;
import com.example.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BrunchDataLoader implements CommandLineRunner {

    @Autowired
    BrunchRepository brunchRepository;

    @Autowired
    MenuRepository menuRepository;

    @Override
    public void run(String... args) throws Exception {

        loadBrunchData();
    }

    private void loadBrunchData() {
        if (brunchRepository.count() == 0);
        Menu menu1 = new Menu(1L, 18.00, "SouthWest Omelet" );
        Menu menu2 = new Menu(2L, 27.50, "New York Steak & Eggs");
        Menu menu3 = new Menu(3L, 17.95, "Gulf Shrimp and Grits");


        BrunchPlaces brunchPlaces1 = new BrunchPlaces(1L, "Sunday Brunch Atl", "3402 Piedmont RD NE, Atlanta, GA 30305", "Super clean and the ENERGY is flawless Def a must see if in town" );
        BrunchPlaces brunchPlaces2 = new BrunchPlaces(2L, "Breakfast At Barney’s", "349 Decatur St. NE Unit A1, Atlanta, GA 30312", "The next closest thing is the vibe and the service which is top notch." );
        BrunchPlaces brunchPlaces3 = new BrunchPlaces(3L, "Atlanta Breakfast Club", "249 Ivan Allen Jr Blvd NW, Atlanta, GA 30313", "Great place to visit great atmosphere great food great service great owner.");

        brunchPlaces1.setMenu(menu1);
        brunchPlaces2.setMenu(menu2);
        brunchPlaces3.setMenu(menu3);

        menuRepository.save(menu1);
        menuRepository.save(menu2);
        menuRepository.save(menu3);

        brunchRepository.save(brunchPlaces1);
        brunchRepository.save(brunchPlaces2);
        brunchRepository.save(brunchPlaces3);







    }
}

