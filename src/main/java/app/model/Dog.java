package app.model;

import app.model.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "I am a Dog";
    }

}
