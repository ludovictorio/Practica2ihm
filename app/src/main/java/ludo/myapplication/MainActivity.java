package ludo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String pueblo = "provincia";
    private ListView lista1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViews();
        setListeners();
    }

    private void getViews() {
        lista1 = (ListView) findViewById(R.id.listView);
    }

    private void setListeners() {
        final Intent intent = new Intent(this,activity2.class);
        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String itemSeleccionado = adapterView.getItemAtPosition(i).toString();
                intent.putExtra(pueblo, itemSeleccionado);
                startActivity(intent);
            }
        });
    }
}


