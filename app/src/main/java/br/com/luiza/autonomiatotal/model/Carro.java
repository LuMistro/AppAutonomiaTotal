package br.com.luiza.autonomiatotal.model;

public class Carro {

    private String nome;
    private Double kmPercorrido;
    private Double combustivelUsado;
    private Double consumoMedio;


    public Carro() {
    }

    public Carro(String nome, Double kmPercorrido, Double combustivelUsado) {
        this.nome = nome;
        this.kmPercorrido = kmPercorrido;
        this.combustivelUsado = combustivelUsado;
    }

    public Carro(String nome, Double kmPercorrido, Double combustivelUsado, Double consumoMedio) {
        this.nome = nome;
        this.kmPercorrido = kmPercorrido;
        this.combustivelUsado = combustivelUsado;
        this.consumoMedio = consumoMedio;
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

    public Double getCombustivelUsado() {
        return combustivelUsado;
    }

    public void setCombustivelUsado(Double combustivelUsado) {
        this.combustivelUsado = combustivelUsado;
    }

    public Double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(Double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
}
