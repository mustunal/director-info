package com.mustunal.directorinfo.service;

import com.mustunal.directorinfo.domain.Director;
import com.mustunal.directorinfo.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    private final DirectorRepository directorRepository;

    @Autowired
    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public List<Director> getAllDirectors() {
        return directorRepository.getAllDirectors();
    }

    public Director getDirectorByName(String name) {
        return directorRepository.getDirectorByName(name);
    }

    public Director getDirectorById(long id) {
        return directorRepository.getDirectorById(id);
    }
}
