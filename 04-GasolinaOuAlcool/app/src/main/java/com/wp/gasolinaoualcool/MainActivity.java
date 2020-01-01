package com.wp.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcoolId);
        precoGasolina = findViewById(R.id.precoGasolinaId);
        botaoVerificar = findViewById(R.id.botaoVerificarId);
        textoResultado = findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                if(textoPrecoAlcool.isEmpty() || textoPrecoGasolina.isEmpty()){
                    textoResultado.setText("");
                    Toast.makeText(getApplicationContext(),
                            "Preencha os campos acima",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                    double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                    double resultado = valorAlcool / valorGasolina;

                    if(resultado >= 0.7){
                        textoResultado.setText("Compensa mais usar gasolina");
                    } else{
                        textoResultado.setText("Compensa mais usar álcool");
                    }
                }
            }
        });
    }
}
