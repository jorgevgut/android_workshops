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

        //to manually add an event listener use
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //click implementation, remember that the "view" parameter is the source of the event
//            }
//        });


        //Use this to delay starting the activity by 4 seconds
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //use getApplicationContext to get Activity's instance, "this" does not work
//                //since we are being encapsulated by the anonymous Runnable's instance
//                Intent i = new Intent(getApplicationContext(),SettingsActivity.class);
//                startActivity(i);
//            }
//        },4000); //4 second delay in ms

    }

    //this method is being called since the onClick attribute is being set on activity_main.xml parameters
    public void evento(View v) {

        switch (v.getId()) { //check source by checking the id defined in the layout file
            case R.id.btn1:
                Intent i = new Intent(this,SettingsActivity.class);
                i.putExtra(Datos.KEY_NAME,"Jorge");
                startActivity(i);
                break;
        }

    }
}
