package sv.edu.catolica.entrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Casa extends Activity {

    private Button btnayuda, btnSuperior, btnInferior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa);

        btnayuda = findViewById(R.id.btnAyuda);
        btnSuperior = findViewById(R.id.btnParteSuperior);
        btnInferior = findViewById(R.id.btnParteInferior);

        btnayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Ayuda.class);
                startActivity(intent);
            }
        });

        btnSuperior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityParteSuperior.class);
                startActivity(intent);
            }
        });

        btnInferior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityParteInferior.class);
                startActivity(intent);
            }
        });
    }
}