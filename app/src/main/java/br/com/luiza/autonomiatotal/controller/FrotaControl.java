package br.com.luiza.autonomiatotal.controller;


import br.com.luiza.autonomiatotal.model.Frota;

public class FrotaControl {

    private CarroControl carroControl;

    public FrotaControl() {
        carroControl = new CarroControl();

    }

    public Frota calcular(Frota frota) {
        frota.setConsumoMedioDaFrota(carroControl.calcularMedia(frota.getCarros()));
        return frota;
    }

}
