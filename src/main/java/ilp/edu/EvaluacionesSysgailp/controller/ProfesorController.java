package ilp.edu.EvaluacionesSysgailp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import ilp.edu.EvaluacionesSysgailp.entity.Curso;
import ilp.edu.EvaluacionesSysgailp.entity.Profesor;
import ilp.edu.EvaluacionesSysgailp.payload.RestResponse;
import ilp.edu.EvaluacionesSysgailp.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("profesor")
@CrossOrigin(origins = "http://localhost:4200")
public class ProfesorController {

    @Autowired
    private IProfesorService profesorService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping( "/listarCursosProfesor" )
    public List<Curso> obtenerCursosProfesor(@RequestParam Long idprofesor){
        return profesorService.obtenerCursoPorProfesor (idprofesor);
    }

    //Listar Docete 001

    @GetMapping("/lista01")
    public RestResponse listaDocente(){

        List<Profesor> docenteList = this.profesorService.listarDocente01();
        try{
            if (docenteList.isEmpty()){
                return new RestResponse(HttpStatus.NO_CONTENT.value(),"No se encontraron registros");
            }else {
                return new RestResponse(HttpStatus.OK.value(),"Registro de estudiantes ubicados",docenteList);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }
}
