package com.mustunal.directorinfo.repository;

import com.mustunal.directorinfo.domain.Director;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DirectorRepository {

    private final Map<Long,Director> directorMap = new HashMap<>();

    public DirectorRepository() {
        initDirectorMap();
    }

    private void initDirectorMap() {
        Director director = new Director(1,"Frank Darabont");
        directorMap.put(director.getId(),director);

        director = new Director(2,"David Fincher");
        directorMap.put(director.getId(),director);

        director = new Director(3,"Francis Ford Coppola");
        directorMap.put(director.getId(),director);
    }

    public List<Director> getAllDirectors() {
        return new ArrayList<>(directorMap.values());
    }

    public Director getDirectorByName(String name) {
        List<Director> directors = new ArrayList<>(directorMap.values());
        return directors.stream().filter(d->name.equalsIgnoreCase(d.getName())).findFirst().orElse(null);
    }

    public Director getDirectorById(long id) {
        return directorMap.get(id);
    }
}
