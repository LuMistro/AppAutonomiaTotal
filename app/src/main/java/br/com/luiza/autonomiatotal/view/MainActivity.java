package br.com.luiza.autonomiatotal.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.luiza.autonomiatotal.R;
import br.com.luiza.autonomiatotal.controller.CarroControl;
import br.com.luiza.autonomiatotal.model.Carro;

public class MainActivity extends AppCompatActivity {

    private LinearLayout carrosListagem;
    private Carro carro;
    private CarroControl control;
    private List<Carro> carros;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void inicializaElementos() {
        carrosListagem.findViewById(R.id.layoutResultado);
        carro = new Carro();
        carros = new ArrayList<>();
    }

    public void pegaDadosTela() {
        inicializaElementos();
        carro.setNome(findViewById(R.id.etNomeCarro).toString());
        carro.setKmPercorrido(Double.valueOf(findViewById(R.id.etKmPercorrido).toString()));
        carro.setQtdGasolina(Double.valueOf(findViewById(R.id.etCombustivelGasto).toString()));
    }

    public void calcular() {
        control.calculaAutonomia(carro);
        carros.add(carro);

    }

    private void exibirDadosNaView() {
        TextView tvCarroDinamico = new TextView(this);
        tvCarroDinamico.setGravity(Gravity.CENTER);
        tvCarroDinamico.setText("Carro" + carro.getId() + " - " + carro.getAutonomia() + " km/L");
        carrosListagem.addView(tvCarroDinamico);
        tvConsumoMedioFrota.setText(frota.getConsumoMedioDaFrota() + " km/L");

    }

}
