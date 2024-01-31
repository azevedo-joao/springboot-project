package springboot.service;

import springboot.entity.Mitarbeiter;

import java.util.List;

public interface MitarbeiterService {

    List<Mitarbeiter> findAll();

    Mitarbeiter findById(int id);

    Mitarbeiter save(Mitarbeiter mitarbeiter);

    void deleteById(int id);
}
