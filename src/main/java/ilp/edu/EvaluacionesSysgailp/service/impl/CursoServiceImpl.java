package ilp.edu.EvaluacionesSysgailp.service.impl;

import ilp.edu.EvaluacionesSysgailp.dao.ICursoDao;
import ilp.edu.EvaluacionesSysgailp.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    private ICursoDao cursoDao;

}
