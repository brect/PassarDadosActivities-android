package br.com.blimas.passardadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecebeDadosActivity extends AppCompatActivity {

    TextView textoNome, textoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_dados);


        textoNome = findViewById(R.id.valor_capturado_01);
        textoIdade =  findViewById(R.id.valor_capturado_02);

        //Recupera dados enviados da outra activity
        Bundle dadosRecebidos = getIntent().getExtras();
        String nomeRecebido = dadosRecebidos.getString("nome");
        int idadeRecebida = dadosRecebidos.getInt("idade");


        //Configura valores recuperados
        textoNome.setText(nomeRecebido);
        textoIdade.setText(String.valueOf(idadeRecebida));

    }
}
