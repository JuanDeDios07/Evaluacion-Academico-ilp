package ilp.edu.EvaluacionesSysgailp.service.impl;

import ilp.edu.EvaluacionesSysgailp.dao.IProfesorDao;
import ilp.edu.EvaluacionesSysgailp.entity.Curso;
import ilp.edu.EvaluacionesSysgailp.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfesorServiceImpl implements IProfesorService {
    @Autowired
    IProfesorDao profesordao;

    @Override
    public List<Curso> obtenerCursoPorProfesor(Long idprofesor) {
        return this.profesordao.obtenerCursoPorProfesor (idprofesor);
    }
}
