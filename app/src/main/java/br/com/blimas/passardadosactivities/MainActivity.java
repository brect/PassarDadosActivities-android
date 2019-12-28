package br.com.blimas.passardadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnEnviar = findViewById(R.id.btn_enviar_dados);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent recebeDadosActivity = new Intent(getApplicationContext(), RecebeDadosActivity.class);

                //passar dados para activity
                recebeDadosActivity.putExtra("nome", "Bruno");
                recebeDadosActivity.putExtra("idade", "26");



                startActivity(recebeDadosActivity);

            }
        });


    }


}
