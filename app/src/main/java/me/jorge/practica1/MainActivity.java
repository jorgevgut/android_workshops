package me.jorge.practica1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.texto1);
        b.setText("YOLO");
        LinearLayout viewGroup = (LinearLayout)findViewById(R.id.contenedor);
        viewGroup.addView(new Button(this));

        Button button = (Button)findViewById(R.id.btn1);


    }

    public void evento(View v) {

        switch (v.getId()) {
            case R.id.btn1:
                Intent i = new Intent(this,SettingsActivity.class);
                i.putExtra(Datos.KEY_NAME,"Jorge");
                startActivity(i);
                break;
        }

    }
}
