package klonowski.mikolaj.zadanie.InteligentnyDom;

import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {
    StacjaPogodowa stacjaPogodowa;

    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
        if (stacjaPogodowa.getWeather().equals("Jest słonecznie")){
            System.out.println(stacjaPogodowa.getWeather()+". Zasłaniam rolety");
        }else
            System.out.println(stacjaPogodowa.getWeather()+". Podnosze do góry rolety");
    }
}
