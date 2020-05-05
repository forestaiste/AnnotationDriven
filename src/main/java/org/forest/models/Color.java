package org.forest.models;

import java.util.ArrayList;
import java.util.List;

public class Color {

    public Color() {
        List<String> a = new ArrayList();
        initializeColor(a);
    }

    private void initializeColor(List<String> a) {
        String name = "mkek";
        int age = 10;
    }

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}