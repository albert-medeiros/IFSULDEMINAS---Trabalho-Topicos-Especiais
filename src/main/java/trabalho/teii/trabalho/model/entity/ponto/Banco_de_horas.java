package trabalho.teii.trabalho.model.entity.ponto;

public class Banco_de_horas {

    private double total_de_horas;

    public Banco_de_horas(){};

    public Banco_de_horas(double total_de_horas){
        this.total_de_horas = total_de_horas;
    }

    public double getBanco_de_horas(){
        return total_de_horas;
    }

    public void setBanco_de_horas(double total_de_horas){
        this.total_de_horas = total_de_horas;
    }
}
