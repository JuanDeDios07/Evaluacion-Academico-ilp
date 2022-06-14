package ilp.edu.EvaluacionesSysgailp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import ilp.edu.EvaluacionesSysgailp.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("curso")
public class CursoController {

    @Autowired
    private ICursoService cursoService;
    @Autowired
    private ObjectMapper objectMapper;


}
