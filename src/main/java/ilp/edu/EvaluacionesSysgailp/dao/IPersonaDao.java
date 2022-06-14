package ilp.edu.EvaluacionesSysgailp.dao;

import ilp.edu.EvaluacionesSysgailp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
