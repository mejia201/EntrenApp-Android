package sv.edu.catolica.entrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityParteSuperior extends Activity {

    private Button btnEspalda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte_superior);

        btnEspalda = findViewById(R.id.btnEspalda);


        btnEspalda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityEspalda.class);
                startActivity(intent);
            }
        });
    }
}