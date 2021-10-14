package com.github.petermue.demo.openapibean.rest.controller;

import com.github.petermue.demo.openapibean.rest.MyApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class MyController implements MyApi {

    @Override
    public ResponseEntity<String> time() {
        return ResponseEntity.ok(Instant.now().toString());
    }
}
