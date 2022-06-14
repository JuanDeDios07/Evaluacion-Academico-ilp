package ilp.edu.EvaluacionesSysgailp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Estudiante extends Persona{

    @Column(name = "codigo", length = 50, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 50, nullable = false)
    private String serie;

    public Estudiante() {
    }

    public Estudiante(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idpersona, String codigo, String serie) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idpersona, String nombre, String apellido, String telefono, String email, Direccion direccion, String codigo, String serie) {
        super(idpersona, nombre, apellido, telefono, email, direccion);
        this.codigo = codigo;
        this.serie = serie;
    }
}
