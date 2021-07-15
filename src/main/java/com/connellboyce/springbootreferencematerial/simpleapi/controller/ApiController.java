package com.connellboyce.springbootreferencematerial.simpleapi.controller;

import com.connellboyce.springbootreferencematerial.simpleapi.payload.PostRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/get")
    public String sampleGet() {
        return "here is a dummy value";
    }

    // must be recieved in form of JSON
    @PostMapping("/post")
    public String samplePost(@Valid @RequestBody PostRequest postRequest) {
        return "Received message: " + postRequest.getMessage();
    }
}
