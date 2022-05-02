package com.example.appa_backend.service;

import com.example.appa_backend.repository.urlRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class urlService {

    @Autowired
    private urlRepository urlRepository;

    @Transactional
    public String verifyLink(String link) {
        if (urlRepository.existsByLink(link)){
           return "Verified website. Safe to visit.";
        } else {
            return "Website unverified. Possibility of phish website.";
        }
    }
}
