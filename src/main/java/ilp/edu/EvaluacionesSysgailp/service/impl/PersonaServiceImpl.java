package ilp.edu.EvaluacionesSysgailp.service.impl;

import ilp.edu.EvaluacionesSysgailp.dao.IPersonaDao;
import ilp.edu.EvaluacionesSysgailp.entity.Persona;
import ilp.edu.EvaluacionesSysgailp.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }
}
