package ro.ase.dam.seminar4_taskcutiebomboane;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class NouaActivitate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_noua_activitate);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Spinner spinner=findViewById(R.id.spinnerTip);
        ArrayAdapter<tip> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,tip.values());
        spinner.setAdapter(adapter);
    }

    public void adaugareCutie(View view) {
        EditText etNume = findViewById(R.id.etNume);
        EditText etMarca = findViewById(R.id.etMarca);
        EditText etGramaj = findViewById(R.id.etGramaj);
        EditText etNumarBomboane = findViewById(R.id.etNumarBomboane);
        EditText etDataExpirare = findViewById(R.id.etDataExpirare);
        Spinner spinnerTip = findViewById(R.id.spinnerTip);
        CheckBox cbDiscount = findViewById(R.id.cbDiscount);

        CutieBomboane cutie = new CutieBomboane();
        cutie.setName(etNume.getText().toString());
        cutie.setMarca(etMarca.getText().toString());

        if (!etGramaj.getText().toString().isEmpty()) {
            cutie.setGramaj(Float.parseFloat(etGramaj.getText().toString()));
        }

        if (!etNumarBomboane.getText().toString().isEmpty()) {
            cutie.setNumar_bomboane(Integer.parseInt(etNumarBomboane.getText().toString()));
        }

        cutie.setData_expirare(etDataExpirare.getText().toString());
        cutie.setDiversitateBomboane((tip) spinnerTip.getSelectedItem());
        cutie.setDiscount(cbDiscount.isChecked());

        Toast.makeText(this, cutie.toString(), Toast.LENGTH_LONG).show();

        Intent intent = new Intent();
        intent.putExtra("cutie_bomboane", cutie);
        setResult(RESULT_OK, intent);
        finish();
    }
}