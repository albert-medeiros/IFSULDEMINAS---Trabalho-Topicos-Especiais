package trabalho.teii.trabalho.model.entity.ponto;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class Horas_usadas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Temporal(TemporalType.DATE)
    private Date data;

    //@Temporal(TemporalType.TIME)
    private Time horas_usadas;

    public Horas_usadas() {}

    public Horas_usadas(Date data, Time horas_usadas) {
        this.data = data;
        this.horas_usadas = horas_usadas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHoras_usadas() {
        return horas_usadas;
    }

    public void setHoras_usadas(Time horas_usadas) {
        this.horas_usadas = horas_usadas;
    }
}
