package configs;

import entities.Cat;
import entities.Dog;
import entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCustomConfig {
    @Bean
    public Cat getCat() {
        return new Cat();
    }

    @Bean
    public Dog getDog() {
        return new Dog();
    }

    @Bean
    public Parrot getParrot() {
        return new Parrot();
    }

    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }
}
