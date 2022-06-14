package ilp.edu.EvaluacionesSysgailp.dao;

import ilp.edu.EvaluacionesSysgailp.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

public interface IDireccionDao extends JpaRepository<Direccion,Long> {

    @Async
    @Query("SELECT distinct e.direccion  FROM Estudiante e WHERE e.codigo = :codigo")
    Direccion obtenerDireccionPorCodigo(@Param("codigo") String codigo);
}
