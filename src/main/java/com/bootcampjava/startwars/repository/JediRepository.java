package com.bootcampjava.startwars.repository;

import com.bootcampjava.startwars.model.Jedi;

import java.util.List;
import java.util.Optional;

public interface JediRepository {

    Optional<Jedi> findById(Integer id);

    List<Jedi> findAll();

    boolean update(Jedi jedi);

    Jedi save(Jedi jedi);

    boolean delete(Integer id);
}
