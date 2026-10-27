package ro.ase.dam.seminar4_taskcutiebomboane;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvCutii;
    private ArrayAdapter<CutieBomboane> adapter;
    ArrayList<CutieBomboane> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void culegereDate(Intent data)
    {
        if(data != null)
        {
            CutieBomboane cutie =(CutieBomboane) data.getSerializableExtra("cutie_bomboane");

            if(cutie != null)
            {
                list.add(cutie);

                Toast.makeText(this, cutie.toString(), Toast.LENGTH_LONG).show();
            }
        }
    }

    public void afisareLista(View view)
    {
        Intent intent = new Intent(this, VizualizareDate.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("lista_cutii", list);

        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void addCutie(View view)
    {
        Intent it=new Intent(this, NouaActivitate.class);
        startActivityForResult(it,37);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 37 && resultCode == RESULT_OK)
        {
            culegereDate(data);
        }
    }

}
