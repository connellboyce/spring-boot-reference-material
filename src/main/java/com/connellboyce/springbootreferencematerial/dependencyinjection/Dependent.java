package com.connellboyce.springbootreferencematerial.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Dependent {
    //Example of constructor injection
    //It is possible to use @Autowired for field injection, but not recommended here
    private final DependedOn dependedOn;
    public Dependent(DependedOn dependedOn) {
        this.dependedOn = dependedOn;
    }

    public String useDependedOnClass() {
        return dependedOn.whatsMyName();
    }
}
