package org.example.springbootgithubactions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        return  new ResponseEntity<>("welcome to example of github actions with spring boot", HttpStatus.OK);
    }
}
