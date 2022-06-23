package ilp.edu.EvaluacionesSysgailp.service;

import ilp.edu.EvaluacionesSysgailp.entity.Curso;
import ilp.edu.EvaluacionesSysgailp.entity.Profesor;

import java.util.List;

public interface IProfesorService {

    List<Curso> obtenerCursoPorProfesor(Long idprofesor);

    List<Profesor> listarDocente01();
}
