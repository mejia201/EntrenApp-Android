package sv.edu.catolica.entrenapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionScene;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class Activity_Ayuda extends Activity {

    private Button btnAccion, btnAccion2, btnAccion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);

        btnAccion = findViewById(R.id.btnOrganizar);
        btnAccion2 = findViewById(R.id.btnHipertrofia);
        btnAccion3 = findViewById(R.id.btnConsejos);



        btnAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.organizacion);
            }
        });


        btnAccion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.hipertrofia);
            }
        });

        btnAccion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.consejos);
            }
        });




    }

}