package com.example.appa_backend.repository;
import com.example.appa_backend.model.url;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface urlRepository extends JpaRepository<url, Integer> {

    public boolean existsByLink(String link);

}
