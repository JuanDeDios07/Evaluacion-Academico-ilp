package ilp.edu.EvaluacionesSysgailp.dao;

import ilp.edu.EvaluacionesSysgailp.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
    //Buscar estudiante por su codigo
    @Query("SELECT e FROM Estudiante e WHERE e.codigo = :codigo")
    Estudiante obtenerEstudiantePorCodigo(@Param("codigo") String codigo);

    //Lista estudiante por apellido o nombre
    @Query("SELECT e FROM Estudiante e WHERE e.nombre LIKE CONCAT('%',:apenom,'%') OR e.apellido LIKE CONCAT('%',:apenom,'%') ")
    List <Estudiante> obtenerEstudiantePorApellidoNOM(@Param("apenom") String apenom);
}
