package es.upm.miw.listviewlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TO DO Identificar el recurso en la vista
        listView = (ListView) findViewById(R.id.listView);

        // TO DO crear adaptador a partir del recurso (ArrayAdapter.createFromResource)
        ArrayAdapter adaptador = ArrayAdapter.createFromResource(
                this,
                R.array.datos,
                android.R.layout.simple_list_item_1);

        // TO DO Asignar el adaptador al recurso
        listView.setAdapter(adaptador);

        // TO DO Al seleccionar un elemento del recurso -> mostrarlo en un Toast
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] datos;
                datos = getResources().getStringArray(R.array.datos);

                Toast.makeText(getApplicationContext(), datos[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
