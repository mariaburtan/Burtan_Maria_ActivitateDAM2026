package ro.ase.dam.seminar2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitateRezultat extends AppCompatActivity {

    private int nr1, nr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitate_rezultat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent it=getIntent();

        Bundle bundle=it.getExtras(); //returneaza bundle u creat in mainActivity
        String mesaj=bundle.getString("mesaj","");
        this.nr1=bundle.getInt("nr1",0); //val implicita
        this.nr2=bundle.getInt("nr2",0); //val implicita
        //stocate in stiva activitatii onCreate

        Toast.makeText(this,mesaj,Toast.LENGTH_SHORT).show();//lenght_long e 2s
    }

    public void inapoiInActivitate(View view) {
        int suma=this.nr1+this.nr2;
        String mesajNou="Mesaj nou";

        Intent it=new Intent(); //revenire


        it.putExtra("mesaj",mesajNou);
        it.putExtra("suma",suma);
        //ca sa inchidem activ din varful stivei avem nev de rez

        setResult(RESULT_OK, it); //ok si informatia de trimis

        finish();

        //metode dif -> stive diferite de mem
    }
}