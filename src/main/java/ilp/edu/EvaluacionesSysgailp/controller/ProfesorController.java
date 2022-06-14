package ilp.edu.EvaluacionesSysgailp.controller;

import ilp.edu.EvaluacionesSysgailp.entity.Curso;
import ilp.edu.EvaluacionesSysgailp.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("profesor")
public class ProfesorController {

    @Autowired
    private IProfesorService profesorService;

    @GetMapping( "/listarCursosProfesor" )
    public List<Curso> obtenerCursosProfesor(@RequestParam Long idprofesor){
        return profesorService.obtenerCursoPorProfesor (idprofesor);
    }
}
