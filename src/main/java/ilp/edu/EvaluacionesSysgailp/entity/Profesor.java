package ilp.edu.EvaluacionesSysgailp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idprofesor",length = 10,nullable = false)
    private Long idprofesor;

    @Column(name = "salario")
    private Double salario;

    @OneToOne
    @JoinColumn(name = "idpersona",referencedColumnName = "idpersona")
    private Persona persona;

    @ManyToMany
    @JoinTable(name = "profesor_curso",joinColumns = @JoinColumn(name = "idprofesor"),inverseJoinColumns = @JoinColumn(name = "idcurso"))
    private Set<Curso> curso =new HashSet<>();

    public Profesor() {
    }

    public Profesor(Long idprofesor) {
        this.idprofesor = idprofesor;
    }

    public Profesor(Long idprofesor, Double salario, Persona persona, Set<Curso> curso) {
        this.idprofesor = idprofesor;
        this.salario = salario;
        this.persona = persona;
        this.curso = curso;
    }

    public Long getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(Long idprofesor) {
        this.idprofesor = idprofesor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Set<Curso> getCurso() {
        return curso;
    }

    public void setCurso(Set<Curso> curso) {
        this.curso = curso;
    }
}
