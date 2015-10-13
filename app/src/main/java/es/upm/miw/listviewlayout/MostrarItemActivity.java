package es.upm.miw.listviewlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MostrarItemActivity extends AppCompatActivity {

    TextView tvMostrarItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_item);

        tvMostrarItem = (TextView) findViewById(R.id.tvMostrarItem);

        String texto = this.getIntent().getStringExtra("TEXTO");
        tvMostrarItem.setText(texto);

        setResult(RESULT_OK);
        // finish();

    }
}
