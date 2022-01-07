package entities;

import org.springframework.stereotype.Component;

public class Cat {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name = "хуй";
}
