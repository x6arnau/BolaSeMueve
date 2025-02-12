package dev.arnau.bolasemueve;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b;

    CerclesView cerclesView;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Vista directament de la classe
        /*cerclesView = new CerclesView(this);
        setContentView(cerclesView); */

        // Carreguem el View d'un Layout
        setContentView(R.layout.activity_main);
        cerclesView = (CerclesView) findViewById(R.id.exview);
        ThreadAnimacio threadCercle = new ThreadAnimacio(cerclesView);
        threadCercle.start();

    }
}