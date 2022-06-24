package ilp.edu.EvaluacionesSysgailp.service;


import ilp.edu.EvaluacionesSysgailp.entity.Curso;

import java.util.List;

public interface ICursoService {

    List<Curso> listarAsignatura10();

    //este metodo registra un nuevo Asignatura
    Curso guardarAsignatura(Curso asignatura);

}
