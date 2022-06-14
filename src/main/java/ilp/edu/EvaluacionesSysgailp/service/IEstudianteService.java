package ilp.edu.EvaluacionesSysgailp.service;

import ilp.edu.EvaluacionesSysgailp.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    Estudiante obtenerEstudiantePorCodigo(String codigo);

    List<Estudiante> listarEstudiantePorApeNombre(String apenombre);
}
