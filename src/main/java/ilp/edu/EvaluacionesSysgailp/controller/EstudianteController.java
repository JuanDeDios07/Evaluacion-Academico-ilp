package ilp.edu.EvaluacionesSysgailp.controller;

import ilp.edu.EvaluacionesSysgailp.entity.Estudiante;
import ilp.edu.EvaluacionesSysgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudiante")
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;


    //Buscar un estudiante por su código
    @GetMapping( "/buscarEstudianteBycodigo" )
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo) {
        return this.estudianteService.obtenerEstudiantePorCodigo (codigo);
    }

   // Buscar estudiante por nombre o apllido
    @GetMapping("/listarByAppnombre/{appnombre}")
    public List<Estudiante> listarPorApellidoNombre(@PathVariable String appnombre){
        return this.estudianteService.listarEstudiantePorApeNombre(appnombre);
    }
}
