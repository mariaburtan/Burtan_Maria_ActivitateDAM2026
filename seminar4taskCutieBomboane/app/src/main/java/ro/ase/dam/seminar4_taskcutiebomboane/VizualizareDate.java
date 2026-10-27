package ro.ase.dam.seminar4_taskcutiebomboane;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class VizualizareDate extends AppCompatActivity {

    private ArrayList<CutieBomboane> listaCutii;
    private ListView lvCutii;
    private ArrayAdapter<CutieBomboane> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vizualizare_date);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top,
                    systemBars.right, systemBars.bottom);
            return insets;
        });

        lvCutii = findViewById(R.id.lvCutii);

        preiaDate();

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listaCutii);

        lvCutii.setAdapter(adapter);

        lvCutii.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this,listaCutii.get(position).toString(),Toast.LENGTH_LONG).show();
        });

        lvCutii.setOnItemLongClickListener((parent, view, position, id) -> {
            listaCutii.remove(position);
            adapter.notifyDataSetChanged();
            return true;
        });
    }

    public void afisareDate()
    {
        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            listaCutii = (ArrayList<CutieBomboane>) bundle.getSerializable("lista_cutii");

            lvCutii = findViewById(R.id.lvCutii);

            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaCutii);

            lvCutii.setAdapter(adapter);
        }
    }

    public void incarcaDate(View view)
    {
        afisareDate();
    }

    public void preiaDate() {

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            listaCutii = (ArrayList<CutieBomboane>) bundle.getSerializable("lista_cutii");
        }

        if (listaCutii == null) {
            listaCutii = new ArrayList<>();
        }
    }
}