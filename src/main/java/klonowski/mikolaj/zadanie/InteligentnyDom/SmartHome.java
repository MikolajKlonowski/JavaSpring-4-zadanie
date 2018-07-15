package klonowski.mikolaj.zadanie.InteligentnyDom;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class SmartHome {

    private SterownikGlosnika sterownikGlosnika;
    private SterownikPieca sterownikPieca;
    private SterownikRolet sterownikRolet;


    public SmartHome(SterownikGlosnika sterownikGlosnika, SterownikPieca sterownikPieca, SterownikRolet sterownikRolet) {
        this.sterownikGlosnika = sterownikGlosnika;
        this.sterownikPieca = sterownikPieca;
        this.sterownikRolet = sterownikRolet;
    }

    public void run() {
        sterownikGlosnika.run();
        sterownikPieca.run();
        sterownikRolet.run();

    }
}
