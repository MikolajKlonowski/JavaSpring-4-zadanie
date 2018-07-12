package klonowski.mikolaj.zadanie.InteligentnyDom;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SmartHome {

    public SmartHome() {

        StacjaPogodowa stacjaPogodowa = new StacjaPogodowa();
        new SterownikGlosnika(stacjaPogodowa);
        new SterownikPieca(stacjaPogodowa);
        new SterownikRolet(stacjaPogodowa);
    }
}
