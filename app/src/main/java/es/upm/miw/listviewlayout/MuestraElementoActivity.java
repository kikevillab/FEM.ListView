package es.upm.miw.listviewlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MuestraElementoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_elemento);

        // Recupero el recurso asociado en la vista
        TextView tvElementoElegido = (TextView) findViewById(R.id.tvMostrarElemento);

        String elementoElegido = this.getIntent().getStringExtra("OPCION_ELEGIDA");
        tvElementoElegido.setText(elementoElegido);

        setResult(RESULT_OK);
        // finish();
    }
}
