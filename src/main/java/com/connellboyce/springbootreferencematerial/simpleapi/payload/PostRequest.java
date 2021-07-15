package com.connellboyce.springbootreferencematerial.simpleapi.payload;

import javax.validation.constraints.NotBlank;

public class PostRequest {
    @NotBlank
    private String message;

    public String getMessage() {
        return message;
    }
}
