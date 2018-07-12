package klonowski.mikolaj.zadanie.InteligentnyDom;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {


    StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
        turnOn(stacjaPogodowa);
    }

    public void turnOn(StacjaPogodowa stacjaPogodowa) {
        System.out.println("Dzień dobry, Dzisiejsza temperatura " + stacjaPogodowa.getTemp() + " i " + stacjaPogodowa.getWeather() + ". To będzie dobry dzień!");

    }

}
