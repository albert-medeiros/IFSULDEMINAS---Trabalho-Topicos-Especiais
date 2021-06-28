package trabalho.teii.trabalho.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nome;
    private int senha;
    private int admin;
    private double tempo_de_almoco;
    private double carga_de_trabalho;

    public Usuario() {}

    public Usuario(String nome, int senha, int admin, double tempo_de_almoco, double carga_de_trabalho) {
        this.nome = nome;
        this.senha = senha;
        this.admin = admin;
        this.tempo_de_almoco = tempo_de_almoco;
        this.carga_de_trabalho = carga_de_trabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public double getTempo_de_almoco() {
        return tempo_de_almoco;
    }

    public void setTempo_de_almoco(double tempo_de_almoco) {
        this.tempo_de_almoco = tempo_de_almoco;
    }

    public double getCarga_de_trabalho() {
        return carga_de_trabalho;
    }

    public void setCarga_de_trabalho(double carga_de_trabalho) {
        this.carga_de_trabalho = carga_de_trabalho;
    }
}
