package com.example.appa_backend.controller;
import com.example.appa_backend.model.url;
import com.example.appa_backend.repository.urlRepository;

import com.example.appa_backend.service.urlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mainController {

    @Autowired
    private urlRepository URLRepository;

    @GetMapping("/all")
    public List<url> getAllLinks() {
        return URLRepository.findAll();
    }

    @GetMapping("/check")
    public String checkPhishing(@RequestBody String link) {
        if (URLRepository.existsByLink(link)){
            return "Verified website. Safe to visit.";
        } else {
            return "Website unverified. Possibility of phish website.";
        }
    }


}
