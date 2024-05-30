package com.example.LojaPc.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LojaPc.Repository.PcsRepository;
import com.example.LojaPc.models.Pcs;

@RestController
@RequestMapping("pc")


public class pcController {

    @Autowired
    private PcsRepository repository;

    @GetMapping("/")
    public List<Pcs> getAll() {

        List<Pcs> pcList = repository.findAll();
        return pcList;
    }
}