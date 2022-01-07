package entities;

import org.springframework.stereotype.Component;

public class Dog {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name = "хуй побольше";
}
