package com.wp.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Se você traçar metas absurdamente altas e falhar, seu fracasso será melhor que o sucesso de todos",
            "Todo esqueleto do Everest já foi um humano bastante motivado",
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele",
            "O não você já tem, chegou a hora de buscar a humilhação",
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum",
            "Esquece esse medo de tentar e dar errado. Errado é não tentar e deixar a chance do fracasso escapar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               Random randomico = new Random();
               int aleatorio = randomico.nextInt(frases.length);

               textoNovaFrase.setText(frases[aleatorio]);
           }
        });
    }
}
