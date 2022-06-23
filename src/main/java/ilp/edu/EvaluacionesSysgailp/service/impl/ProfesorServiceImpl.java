package ilp.edu.EvaluacionesSysgailp.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import ilp.edu.EvaluacionesSysgailp.dao.IProfesorDao;
import ilp.edu.EvaluacionesSysgailp.entity.Curso;
import ilp.edu.EvaluacionesSysgailp.entity.Profesor;
import ilp.edu.EvaluacionesSysgailp.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class ProfesorServiceImpl implements IProfesorService {
    @Autowired
    IProfesorDao profesordao;

    @Override
    public List<Curso> obtenerCursoPorProfesor(Long idprofesor) {
        return this.profesordao.obtenerCursoPorProfesor (idprofesor);
    }

    @Override
    public List<Profesor> listarDocente01() {
        return this.profesordao.findAll();
    }
}
