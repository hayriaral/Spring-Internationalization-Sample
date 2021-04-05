package com.example.multilang.controller;

import com.example.multilang.service.InternationalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class InternationalizationController {

    private final InternationalizationService service;

    @Autowired
    public InternationalizationController(InternationalizationService service) {
        this.service = service;
    }

    @GetMapping(value = "/")
    public ResponseEntity<String> index(HttpServletRequest request) {
        return ResponseEntity.ok(service.getIndexMessage("user.hello", request));
    }
}