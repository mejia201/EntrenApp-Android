package sv.edu.catolica.entrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityEspalda extends Activity {

    private Button btnPoleaPecho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espalda);

        btnPoleaPecho = findViewById(R.id.btnPoleaPecho);

        btnPoleaPecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.polea_pecho);
            }
        });


    }
}