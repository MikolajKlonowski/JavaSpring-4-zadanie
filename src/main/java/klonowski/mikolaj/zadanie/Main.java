package klonowski.mikolaj.zadanie;

import klonowski.mikolaj.zadanie.InteligentnyDom.SmartHome;
import klonowski.mikolaj.zadanie.InteligentnyDom.SterownikGlosnika;
import klonowski.mikolaj.zadanie.InteligentnyDom.SterownikPieca;
import klonowski.mikolaj.zadanie.InteligentnyDom.SterownikRolet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Main.class, args);
        SmartHome smartHome = configurableApplicationContext.getBean(SmartHome.class);
        smartHome.run();

    }


}
