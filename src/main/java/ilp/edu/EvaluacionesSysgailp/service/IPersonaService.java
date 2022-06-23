package ilp.edu.EvaluacionesSysgailp.service;

import ilp.edu.EvaluacionesSysgailp.entity.Persona;

import java.util.List;

public interface IPersonaService {

    //Lista de personas
    List<Persona> listarPersona();
// lista de persona 0001
    List<Persona> listarPersonas01();

    //registrar persona
    Persona registraPersona(Persona persona);


}
