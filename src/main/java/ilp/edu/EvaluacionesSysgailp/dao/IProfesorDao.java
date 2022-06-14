package ilp.edu.EvaluacionesSysgailp.dao;

import ilp.edu.EvaluacionesSysgailp.entity.Curso;
import ilp.edu.EvaluacionesSysgailp.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {

    @Query("SELECT p.curso FROM Profesor p WHERE p.idprofesor = :idprofesor")
    List<Curso> obtenerCursoPorProfesor(@Param("idprofesor") Long idprofesor);
}
