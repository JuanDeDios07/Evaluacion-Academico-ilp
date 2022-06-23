package ilp.edu.EvaluacionesSysgailp.service;

import ilp.edu.EvaluacionesSysgailp.entity.Estudiante;
import ilp.edu.EvaluacionesSysgailp.entity.Persona;

import java.util.List;

public interface IEstudianteService {

    Estudiante obtenerEstudiantePorCodigo(String codigo);

    List<Estudiante> listarEstudiantePorApeNombre(String apenombre);

    //registrar estudiante
    Estudiante registrarEstudiante01(Estudiante estudiante);

    //lista de estudiantes 001

    List<Estudiante> listarEstudiantes01();
}
