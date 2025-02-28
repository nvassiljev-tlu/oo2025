package ee.nikita.kymnevoistlus.repository;

import ee.nikita.kymnevoistlus.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Long> {
}
