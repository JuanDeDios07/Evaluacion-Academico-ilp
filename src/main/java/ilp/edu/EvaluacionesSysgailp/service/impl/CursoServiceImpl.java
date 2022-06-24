package ilp.edu.EvaluacionesSysgailp.service.impl;

import ilp.edu.EvaluacionesSysgailp.dao.ICursoDao;
import ilp.edu.EvaluacionesSysgailp.entity.Curso;
import ilp.edu.EvaluacionesSysgailp.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    private ICursoDao cursoDao;

    @Override
    public List<Curso> listarAsignatura10() {
        return this.cursoDao.findAll();
    }

    @Override
    public Curso guardarAsignatura(Curso asignatura) {
        return this.cursoDao.save(asignatura);

    }
}
