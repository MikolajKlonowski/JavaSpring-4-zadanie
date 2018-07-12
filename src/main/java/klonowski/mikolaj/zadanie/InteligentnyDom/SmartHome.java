package klonowski.mikolaj.zadanie.InteligentnyDom;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SmartHome {

    public SmartHome() {
        Random random = new Random();
        StacjaPogodowa stacjaPogodowa = new StacjaPogodowa();
        SterownikGlosnika sterownikGlosnika = new SterownikGlosnika(stacjaPogodowa);
        SterownikPieca sterownikPieca = new SterownikPieca(stacjaPogodowa);
        SterownikRolet sterownikRolet = new SterownikRolet(stacjaPogodowa);
    }
}
