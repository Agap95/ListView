package com.example.usuario.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista =(ListView)findViewById(R.id.Lista);//creo la variable lista para enlasarle con el id Lista
        ListView lista1=(ListView)findViewById(R.id.Lista1);
        String[] a = {"Richar","Miller","Ricki","Meyller"};
        ArrayAdapter i = new ArrayAdapter(this, android.R.layout.simple_list_item_1, a);
        String[] b = getResources().getStringArray(R.array.ola);
        ArrayAdapter l = new ArrayAdapter(this, android.R.layout.simple_list_item_1, b);//son las cosas que quieres mostar; unir el array que voy a crear con la lista
        //uso la variable del ListView que voy a usar
        lista.setAdapter(l);
        lista1.setAdapter(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
