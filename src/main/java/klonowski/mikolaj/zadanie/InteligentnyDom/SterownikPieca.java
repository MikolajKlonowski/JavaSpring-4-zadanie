package klonowski.mikolaj.zadanie.InteligentnyDom;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {
    StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
        if (stacjaPogodowa.getTemp() < 15) {
            System.out.println("Jest zimno uruchamiam piec");
        } else
            System.out.println("Jest ciepło nie uruchamiam pieca");
    }
}
