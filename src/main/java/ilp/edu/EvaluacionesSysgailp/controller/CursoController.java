package ilp.edu.EvaluacionesSysgailp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ilp.edu.EvaluacionesSysgailp.entity.Curso;
import ilp.edu.EvaluacionesSysgailp.payload.RestResponse;
import ilp.edu.EvaluacionesSysgailp.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("curso")
@CrossOrigin(origins = "http://localhost:4200")
public class CursoController {
    @Autowired
    private ICursoService cursoService;
    @Autowired
    private ObjectMapper objectMapper;
    @GetMapping("/lista01")
    public RestResponse listaAsignatura(){
        List<Curso> asignaturaList = this.cursoService.listarAsignatura10();
        try{
            if (asignaturaList.isEmpty()){
                return new RestResponse(HttpStatus.NO_CONTENT.value(),"No se encontraron registros");
            }else {
                return new RestResponse(HttpStatus.OK.value(),"Registro de Asinatura ubicados",asignaturaList);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }


    //Registrar Asignatura
    @PostMapping("/registrar")
    public RestResponse registrarAsignatura(@RequestBody String jsonAsignatura) throws JsonProcessingException {

        Curso asignatura = this.objectMapper.readValue(jsonAsignatura, Curso.class);
        try {
            this.cursoService.guardarAsignatura(asignatura);
            return new RestResponse(HttpStatus.OK.value(),"La Asignatura se registró correctamente",asignatura);
        }catch (Exception e) {
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }
}
