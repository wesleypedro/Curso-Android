package com.wp.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.caixaTextoId);
        botaoIdade = findViewById(R.id.botaoIdadeId);
        resultadoIdade = findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty())
                    resultadoIdade.setText("Digite um valor para a idade do cachorro");
                else{
                    int idade = Integer.parseInt(textoDigitado);
                    int resultadoFinal = idade * 7;
                    resultadoIdade.setText("A idade do cachorro em anos humanos é: " + resultadoFinal + " anos.");
                }
            }
        });
    }
}
