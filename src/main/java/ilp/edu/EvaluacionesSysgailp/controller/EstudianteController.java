package ilp.edu.EvaluacionesSysgailp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ilp.edu.EvaluacionesSysgailp.entity.Estudiante;
import ilp.edu.EvaluacionesSysgailp.entity.Persona;
import ilp.edu.EvaluacionesSysgailp.payload.RestResponse;
import ilp.edu.EvaluacionesSysgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudiante")
@CrossOrigin(origins = "http://localhost:4200")
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @Autowired
    private ObjectMapper objectMapper;

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
    //registrar estudiante
    @PostMapping("/registrar")
    public RestResponse registrarEstudiante(@RequestBody String jsonEstudiante) throws JsonProcessingException {

        Estudiante estudiante = this.objectMapper.readValue(jsonEstudiante, Estudiante.class);
        try {
            this.estudianteService.registrarEstudiante01(estudiante);
            return new RestResponse(HttpStatus.OK.value(),"La Persona se registró correctamente",estudiante);
        }catch (Exception e) {
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }
//lista de estudiantes0001


    @GetMapping("/lista01")
    public RestResponse listaEstudiante(){

        List<Estudiante>estudiateList = this.estudianteService.listarEstudiantes01();
        try{
            if (estudiateList.isEmpty()){
                return new RestResponse(HttpStatus.NO_CONTENT.value(),"No se encontraron registros");
            }else {
                return new RestResponse(HttpStatus.OK.value(),"Registro de estudiantes ubicados",estudiateList);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }
}
