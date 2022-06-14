package ilp.edu.EvaluacionesSysgailp.service.impl;

import ilp.edu.EvaluacionesSysgailp.dao.IDireccionDao;
import ilp.edu.EvaluacionesSysgailp.entity.Direccion;
import ilp.edu.EvaluacionesSysgailp.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    IDireccionDao direccionDao;

    @Override
    public Direccion obtenerDireccionPorCodigo(String codigo) {
        return this.direccionDao.obtenerDireccionPorCodigo(codigo);
    }
}
