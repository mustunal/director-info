package com.mustunal.directorinfo.controller;

import com.mustunal.directorinfo.domain.Director;
import com.mustunal.directorinfo.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/director-info")
public class DirectorController {

    private final DirectorService directorService;

    @Autowired
    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello World - v1";
    }

    @GetMapping
    public List<Director> getAllDirectors(){
        return directorService.getAllDirectors();
    }

    @GetMapping("/getDirectorByName/{name}")
    public Director getDirectorByName(@PathVariable String name){
        return directorService.getDirectorByName(name);
    }

    @GetMapping("/getDirectorById/{id}")
    public Director getDirectorById(@PathVariable long id){
        return directorService.getDirectorById(id);
    }
}
