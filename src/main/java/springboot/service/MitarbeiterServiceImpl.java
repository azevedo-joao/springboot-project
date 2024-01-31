package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.dao.MitarbeiterRepository;
import springboot.entity.Mitarbeiter;

import java.util.List;
import java.util.Optional;

@Service
public class MitarbeiterServiceImpl implements MitarbeiterService {

    private MitarbeiterRepository mitarbeiterRepository;

    @Autowired
    public MitarbeiterServiceImpl(MitarbeiterRepository mitarbeiterRepository) {
        this.mitarbeiterRepository = mitarbeiterRepository;
    }

    @Override
    public List<Mitarbeiter> findAll() {
        return mitarbeiterRepository.findAllByOrderByNachnameAsc();
    }

    @Override
    public Mitarbeiter findById(int id) {

        Optional<Mitarbeiter> ergebnis = mitarbeiterRepository.findById(id);
        Mitarbeiter mitarbeiter = null;

        if(ergebnis.isPresent()) {
            mitarbeiter = ergebnis.get();
        } else {
            throw new RuntimeException("Mitarbeiter mit dem ID " + id + " nicht gefunden.");
        }

        return mitarbeiter;
    }

    @Override
    public Mitarbeiter save(Mitarbeiter mitarbeiter) {
        return mitarbeiterRepository.save(mitarbeiter);
    }

    @Override
    public void deleteById(int id) {
        mitarbeiterRepository.deleteById(id);
    }
}
