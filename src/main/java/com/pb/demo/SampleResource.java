package com.pb.demo;

import model.Model;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {

    @GetMapping("hi")
    private ResponseEntity sample() {
        Model.Collection c = Model.Collection.newBuilder()
                .setId("1")
                .setName("Amarnath")
                .setDescription("Sample Name").build();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
}
