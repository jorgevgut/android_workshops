package me.jorge.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Bundle bundle = getIntent().getExtras();
        String valor = bundle.getString(Datos.KEY_NAME);
        ((TextView)findViewById(R.id.settings_text1)).setText(valor);
    }
}
