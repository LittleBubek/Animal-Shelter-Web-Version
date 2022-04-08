package agatkafraczek.animalshelter.animalshelter.repositories;

import agatkafraczek.animalshelter.animalshelter.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
