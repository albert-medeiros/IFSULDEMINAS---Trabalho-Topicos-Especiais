package trabalho.teii.trabalho.model.entity.ponto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Horas_usadas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date data;
    private double horas_usadas;


    public Horas_usadas() {}

    public Horas_usadas(Date data, double horas_usadas) {
        this.data = data;
        this.horas_usadas = horas_usadas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getHoras_usadas() {
        return horas_usadas;
    }

    public void setHoras_usadas(double horas_usadas) {
        this.horas_usadas = horas_usadas;
    }
}
