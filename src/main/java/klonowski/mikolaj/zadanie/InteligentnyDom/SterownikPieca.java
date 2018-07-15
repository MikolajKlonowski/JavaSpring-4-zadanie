package klonowski.mikolaj.zadanie.InteligentnyDom;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca implements Sterownik{
    private StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;

    }

    @Override
    public void run() {
        if (stacjaPogodowa.getTemp() < 15) {
            System.out.println("Jest zimno uruchamiam piec");
        } else
            System.out.println("Jest ciepło nie uruchamiam pieca");

    }
}
