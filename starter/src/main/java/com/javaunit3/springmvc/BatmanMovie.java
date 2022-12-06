package com.javaunit3.springmvc;

import org.springframework.stereotype.Component;

@Component
public class BatmanMovie {
    public String getTitle() {
        return "Batman: The Dark Knight";
    }

    public String getMaturityRating() {
        return "PG-13";
    }

    public String getGenre() {
        return "Action";
    }
}
