package br.com.luiza.autonomiatotal.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.luiza.autonomiatotal.R;
import br.com.luiza.autonomiatotal.controller.CarroControl;
import br.com.luiza.autonomiatotal.controller.FrotaControl;
import br.com.luiza.autonomiatotal.model.Carro;
import br.com.luiza.autonomiatotal.model.Frota;

public class MainActivity extends AppCompatActivity {

    private CarroControl carroControl;
    private FrotaControl frotaControl;

    private Carro carro;
    private Frota frota;

    private List<String> carroList;

    private EditText etNomeCarro;
    private EditText etKmPercorrido;
    private EditText etCombustivelUsado;

    private TextView tvAutonomiaFrota;

    private ListView viewResultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializaElementos();
    }


    private void inicializaElementos() {
        etNomeCarro = findViewById(R.id.edtNomeCarro);
        etKmPercorrido = findViewById(R.id.edtKmPercorrida);
        etCombustivelUsado = findViewById(R.id.edtQtdCombustivel);

        frota = new Frota(new ArrayList<Carro>(), 0.0);
        tvAutonomiaFrota = findViewById(R.id.tvConsumoMedioFrota);
        viewResultados = findViewById(R.id.listView);
        carroControl = new CarroControl();
        frotaControl = new FrotaControl();

        carroList = new ArrayList<>();
    }

    private boolean verificaPreenchimento() {
        if (!etNomeCarro.getText().toString().equals("") && etNomeCarro.getText().toString() != null) {
            return true;
        }
        if (!etKmPercorrido.getText().toString().equals("") && etKmPercorrido.getText().toString() != null) {
            return true;
        }
        if (!etCombustivelUsado.getText().toString().equals("") && etCombustivelUsado.getText().toString() != null) {
            return true;
        }
        return false;
    }

    public void calcular(View view) {
        pegaDadosTela();
        carro = carroControl.calcular(carro);
        frota = frotaControl.calcular(frota);
        mostraDadosNaTela();
    }


    public void limparDados(View view) {
        etNomeCarro.setText("");
        etKmPercorrido.setText("");
        etCombustivelUsado.setText("");
        carro = new Carro();
    }


    private void pegaDadosTela() {
        if (verificaPreenchimento()) {
            carro = new Carro(etNomeCarro.getText().toString(), Double.valueOf(etKmPercorrido.getText().toString()), Double.valueOf(etCombustivelUsado.getText().toString()));
            frota.getCarros().add(carro);
        } else {
            carro = new Carro("Não Informado", 0.0, 0.0);
            Toast.makeText(this, "Preencha os campos corretamente!!!", Toast.LENGTH_LONG);
        }
    }


    private void mostraDadosNaTela() {
        carroList.add(carro.getNome() + " - " + carro.getConsumoMedio() + " km/L");
        tvAutonomiaFrota.setText(frota.getConsumoMedioDaFrota() + " km/L");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, carroList);
        viewResultados.setAdapter(arrayAdapter);
    }


}
