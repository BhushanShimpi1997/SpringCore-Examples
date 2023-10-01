package com.volkswagen.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle {
    @Value("${circle.radious}")
    private float radious;

    public float getRadious() {
        return radious;
    }

    public void setRadious(float radious) {
        this.radious = radious;
    }
}
