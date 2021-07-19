package trabalho.teii.trabalho.model.entity.ponto;

import javax.persistence.*;

@Entity
public class Banco_de_horas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int total_de_horas;

    @OneToOne
    private Horas_usadas horas_gastas;

    public Banco_de_horas(){};

    public Banco_de_horas(int total_de_horas, Horas_usadas horas_gastas){
        this.total_de_horas = total_de_horas;
        this.horas_gastas = horas_gastas;
    }

    //Get Set Banco_de_horas
    public double getBanco_de_horas(){
        return total_de_horas;
    }
    public void setBanco_de_horas(int total_de_horas){
        this.total_de_horas = total_de_horas;
    }
}
