package br.ulbra.powercalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView txRes;
        Button bnCal;
        EditText edNome, edPreco, edPotencia, edHoras;

        txRes = findViewById(R.id.txtRes);
        bnCal = findViewById(R.id.btnCal);
        edNome = findViewById(R.id.edtNome);
        edHoras = findViewById(R.id.edtHoras);
        edPotencia = findViewById(R.id.edtPotencia);
        edPreco = findViewById(R.id.edtPreco);

        bnCal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("ALERTA");
                dialogo.setNeutralButton("OK", null);

                // Validação: Campo Nome
                if (edNome.getText().toString().trim().isEmpty()){
                    dialogo.setMessage("Campo de nome não pode ser vazio");
                    dialogo.show();
                    return; // Interrompe a função se o erro ocorrer
                }

                // Validação: Campo potencia
                else if (edPotencia.getText().toString().trim().isEmpty()){
                    dialogo.setMessage("Campo de potência não pode ser vazio");
                    dialogo.show();
                    return;
                }

                // Validação: Distância (Não vazia e maior que zero)
                else if (edPreco.getText().toString().trim().isEmpty()){
                    dialogo.setMessage("Campo de distancia não pode ser vazio ou menor e igual a zero");
                    dialogo.show();
                    return;
                }

                // Validação: Consumo (Não vazio e maior que zero)
                else if (edHoras.getText().toString().trim().isEmpty() ){
                    dialogo.setMessage("Campo de consumo não pode ser vazio ou menor e igual a zero");
                    dialogo.show();
                    return;
                }


                int potencia;
                double hora, ce, custo, preco;
                String resultado;

                potencia = Integer.parseInt(edPotencia.getText().toString());
                hora = Integer.parseInt(edHoras.getText().toString());
                preco = Integer.parseInt(edPreco.getText().toString());

                ce = (potencia*hora)/1000;

                custo = ce*preco;

                resultado = "Resultado Estimado: \n"+
                        "Nome: "+edNome.getText()+
                        "\nConsumo diário: "+ce+
                        "\nCusto estimado: "+custo;
                txRes.setText(resultado);



            }
        });
    }
}