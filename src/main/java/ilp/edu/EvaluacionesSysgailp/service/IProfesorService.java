package ilp.edu.EvaluacionesSysgailp.service;

import ilp.edu.EvaluacionesSysgailp.entity.Curso;

import java.util.List;

public interface IProfesorService {

    List<Curso> obtenerCursoPorProfesor(Long idprofesor);
}
