package es.upm.miw.listviewlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TO DO Identificar el recurso en la vista
        final ListView listView = (ListView) findViewById(R.id.lvListadoElementos);

        // TO DO crear adaptador a partir del recurso (ArrayAdapter.createFromResource)
        ArrayAdapter adaptador = ArrayAdapter.createFromResource(
                this,
                R.array.datos,
                android.R.layout.simple_list_item_1
        );

        // TO DO Asignar el adaptador al recurso
        listView.setAdapter(adaptador);

        // TO DO Al seleccionar un elemento del recurso -> mostrarlo en un Toast
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcionElegida = listView.getItemAtPosition(position).toString();

                Log.i("Opción elegida", opcionElegida);
//                Toast.makeText(getApplicationContext(), opcionElegida, Toast.LENGTH_SHORT).show();
                Intent nuevoIntent = new Intent(MainActivity.this, MuestraElementoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("OPCION_ELEGIDA", opcionElegida);
                bundle.putInt("NUMERO_OPCION", position);
                nuevoIntent.putExtras(bundle);
                startActivity(nuevoIntent);
            }
        });

    }
}
