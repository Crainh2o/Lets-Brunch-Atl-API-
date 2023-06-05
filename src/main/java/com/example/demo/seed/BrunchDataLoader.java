import com.example.demo.model.BrunchPlaces;
import com.example.demo.model.Menu;
import com.example.demo.repository.BrunchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class BrunchDataLoader implements CommandLineRunner {

    @Autowired
    BrunchRepository brunchRepository;

    @Override
    public void run(String... args) throws Exception {

    }

    private void loadBrunchData() {
        if (brunchRepository.findByMenuIdAndName());
        Menu menu1 = new Menu(1L, 39.99, "sundaybrunchatl.com" );
        Menu menu2 = new Menu(2L, 50.00, "breakfastatbarneys.com");
        Menu menu3 = new Menu(3L, 80.00, "atlbreakfastclub.com");

        BrunchPlaces brunchPlaces1 = new BrunchPlaces(1L, "Sunday Brunch Atl", "3402 Piedmont RD NE, Atlanta, GA 30305", "Super clean and the ENERGY is flawless Def a must see if in town" );
        BrunchPlaces brunchPlaces2 = new BrunchPlaces(2L, "Breakfast At Barney’s", "349 Decatur St. NE Unit A1, Atlanta, GA 30312", "The next closest thing is the vibe and the service which is top notch." );
        BrunchPlaces brunchPlaces3 = new BrunchPlaces(3L, "Atlanta Breakfast Club", "249 Ivan Allen Jr Blvd NW, Atlanta, GA 30313", "Great place to visit great atmosphere great food great service great owner.");

        brunchRepository.save(menu1);
        brunchRepository.save(menu2);
        brunchRepository.save(menu3);




    }
}

