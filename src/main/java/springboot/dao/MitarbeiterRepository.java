package springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.entity.Mitarbeiter;

import java.util.List;

public interface MitarbeiterRepository extends JpaRepository<Mitarbeiter, Integer> {

    public List<Mitarbeiter> findAllByOrderByNachnameAsc();
}
