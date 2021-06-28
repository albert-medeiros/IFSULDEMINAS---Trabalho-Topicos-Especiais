package trabalho.teii.trabalho.model.entity.ponto;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Ponto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Temporal(TemporalType.DATE)
    private Date data;
    @Temporal(TemporalType.TIME)
    private double horario;

    //Conjuntos de Agregação
    @OneToMany
    @JoinColumn(name = "ponto_id")
    private Set<Banco_de_horas> banco_horas;

    public Ponto() {}

    public Ponto(Date data, double horario) {
        this.data = data;
        this.horario = horario;

        this.banco_horas = new LinkedHashSet<Banco_de_horas>();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }
}
