package trabalho.teii.trabalho.model.entity.ponto;

import java.util.Date;

public class Ponto {

    private Date data;
    private double horario;

    public Ponto() {}

    public Ponto(Date data, double horario) {
        this.data = data;
        this.horario = horario;
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
