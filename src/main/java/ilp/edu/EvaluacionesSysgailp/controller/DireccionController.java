package ilp.edu.EvaluacionesSysgailp.controller;

import ilp.edu.EvaluacionesSysgailp.entity.Direccion;
import ilp.edu.EvaluacionesSysgailp.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("direccion")
public class DireccionController {


    @Autowired
    private IDireccionService direccionService;

        //Obtener la dirección de un estudiante.
    @GetMapping( "/buscarDireccionBycodigo" )
    public Direccion buscarDireccionByCodigo(@RequestParam String codigo) {
        return this.direccionService.obtenerDireccionPorCodigo (codigo);

    }
}
