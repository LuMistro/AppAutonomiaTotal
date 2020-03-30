package br.com.luiza.autonomiatotal.model;

public class Carro {
    private Integer id;
    private String nome;
    private Double kmPercorrido;
    private Double qtdGasolina;
    private Double autonomia;

    public Carro() {
    }

    public Carro(Integer id, String nome, Double kmPercorrido, Double qtdGasolina, Double autonomia) {
        this.id = id;
        this.nome = nome;
        this.kmPercorrido = kmPercorrido;
        this.qtdGasolina = qtdGasolina;
        this.autonomia = autonomia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(Double kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public Double getQtdGasolina() {
        return qtdGasolina;
    }

    public void setQtdGasolina(Double qtdGasolina) {
        this.qtdGasolina = qtdGasolina;
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }
}
