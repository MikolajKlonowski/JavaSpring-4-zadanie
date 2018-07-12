package klonowski.mikolaj.zadanie;

import klonowski.mikolaj.zadanie.InteligentnyDom.SmartHome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    SmartHome smartHome = new SmartHome();

}
