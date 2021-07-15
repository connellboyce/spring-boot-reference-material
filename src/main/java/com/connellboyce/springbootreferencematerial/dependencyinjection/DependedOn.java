package com.connellboyce.springbootreferencematerial.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class DependedOn {
    private String name = "Depended On";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String whatsMyName() {
        return "My name is " + this.getName();
    }
}
