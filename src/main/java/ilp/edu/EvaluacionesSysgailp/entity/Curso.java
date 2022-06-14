package ilp.edu.EvaluacionesSysgailp.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcurso")
    private Long idcurso;

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name = "creditos", length = 10)
    private String creditos;

    @Column(name = "sigla", length = 10)
    private String sigla;

    public Curso() {
    }

    public Curso(Long idcurso) {
        this.idcurso = idcurso;
    }

    public Curso(Long idcurso, String denominacion, String creditos, String sigla) {
        this.idcurso = idcurso;
        this.denominacion = denominacion;
        this.creditos = creditos;
        this.sigla = sigla;
    }

    public Long getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Long idcurso) {
        this.idcurso = idcurso;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
