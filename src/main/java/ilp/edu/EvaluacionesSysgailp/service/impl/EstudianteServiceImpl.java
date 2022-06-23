package ilp.edu.EvaluacionesSysgailp.service.impl;

import ilp.edu.EvaluacionesSysgailp.dao.IEstudianteDao;
import ilp.edu.EvaluacionesSysgailp.entity.Estudiante;
import ilp.edu.EvaluacionesSysgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;
    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.estudianteDao.obtenerEstudiantePorCodigo(codigo);
    }

    @Override
    public List<Estudiante> listarEstudiantePorApeNombre(String apenombre) {
        return this.estudianteDao.obtenerEstudiantePorApellidoNOM(apenombre);
    }

    @Override
    public Estudiante registrarEstudiante01(Estudiante estudiante) {
        return this.estudianteDao.save(estudiante);

        //return this.escuelaDao.save(escuela);
    }

    @Override
    public List<Estudiante> listarEstudiantes01() {
        return this.estudianteDao.findAll();
    }
}
