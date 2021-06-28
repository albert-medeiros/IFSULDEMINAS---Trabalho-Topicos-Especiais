package trabalho.teii.trabalho.model.entity;

import trabalho.teii.trabalho.model.entity.ponto.Banco_de_horas;
import trabalho.teii.trabalho.model.entity.ponto.Ponto;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nome;
    private int senha;
    private int admin;
    private double tempo_de_almoco;
    private double carga_de_trabalho;

    //Conjuntos de Agregação
    @OneToMany
    @JoinColumn(name = "usuario_id")
    private Set<Ponto> pontos;

    public Usuario() {}

    //Atributos
    public Usuario(String nome, int senha, int admin, double tempo_de_almoco, double carga_de_trabalho) {
        this.nome = nome;
        this.senha = senha;
        this.admin = admin;
        this.tempo_de_almoco = tempo_de_almoco;
        this.carga_de_trabalho = carga_de_trabalho;

        this.pontos = new LinkedHashSet<Ponto>();
    }


    //Get Set Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Get Set Senha
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    //Get Set Admin
    public int getAdmin() {
        return admin;
    }
    public void setAdmin(int admin) {
        this.admin = admin;
    }

    //Get Set Tempo
    public double getTempo_de_almoco() {
        return tempo_de_almoco;
    }
    public void setTempo_de_almoco(double tempo_de_almoco) {
        this.tempo_de_almoco = tempo_de_almoco;
    }

    //Get Set Carga de Trabalho
    public double getCarga_de_trabalho() {
        return carga_de_trabalho;
    }
    public void setCarga_de_trabalho(double carga_de_trabalho) {
        this.carga_de_trabalho = carga_de_trabalho;
    }
}
