package br.com.luiza.autonomiatotal.controller;

import br.com.luiza.autonomiatotal.model.Carro;

public class CarroControl {

    public Double calculaAutonomia(Carro carro) {
        return carro.getKmPercorrido() / carro.getQtdGasolina();
    }


}
