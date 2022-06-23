package ilp.edu.EvaluacionesSysgailp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ilp.edu.EvaluacionesSysgailp.entity.Persona;
import ilp.edu.EvaluacionesSysgailp.payload.RestResponse;
import ilp.edu.EvaluacionesSysgailp.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/listarPersona")
    public List<Persona> listarPersona(){
        return  this.personaService.listarPersona();
    }


// lista de personas 0001
    @GetMapping("/lista")
    public RestResponse listaEscuela(){

        List<Persona> personaList = this.personaService.listarPersonas01();
        try{
            if (personaList.isEmpty()){
                return new RestResponse(HttpStatus.NO_CONTENT.value(),"No se encontraron registros");
            }else {
                return new RestResponse(HttpStatus.OK.value(),"Registro de estudiantes ubicados",personaList);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }

    //registrar persona

    @PostMapping("/registrar")
    public RestResponse registrarPersona(@RequestBody String jsonPersona) throws JsonProcessingException {

        Persona persona = this.objectMapper.readValue(jsonPersona, Persona.class);
        try {
            this.personaService.registraPersona(persona);
            return new RestResponse(HttpStatus.OK.value(),"La Persona se registró correctamente",persona);
        }catch (Exception e) {
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Lamentamos el inconveniente, vuelva mas tarde");
        }
    }
}
