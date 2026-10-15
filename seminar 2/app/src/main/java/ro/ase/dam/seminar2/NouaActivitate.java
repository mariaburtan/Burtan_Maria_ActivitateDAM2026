package ro.ase.dam.seminar2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
=======

import androidx.activity.EdgeToEdge;
>>>>>>> f1dcd90883c5856c2e4238e3bf0441363caa41db
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NouaActivitate extends AppCompatActivity {
<<<<<<< HEAD
=======

>>>>>>> f1dcd90883c5856c2e4238e3bf0441363caa41db
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
    }

<<<<<<< HEAD
   /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==83) //ca sa verificam daca vine din activitatea noastra
        {
            if(resultCode==RESULT_OK)
            {
                //intent - transmite mesaj activitatii anterioare
                String mesajIntors=data.getStringExtra("mesaj");
                int suma=data.getIntExtra("suma",0);
                //am preluat valorile transmise
                Toast.makeText(this,mesajIntors+" "+suma,Toast.LENGTH_SHORT);//context, mesaj, durata
            }
        }
    }*/

    public void deschideActivitate(View view) {
        Intent intent = new Intent(this, ActivitateRezultat.class);

        Bundle bundle = new Bundle();
        bundle.putString("mesaj", "Salut de la a doua activitate!");
        bundle.putInt("valoare1", 10);
        bundle.putInt("valoare2", 20);

        intent.putExtras(bundle);
        startActivity(intent);
    }

=======
    public void  openActiviy(View view){

        Intent it= new Intent(this, ActivitateRezultat.class);
        startActivity(it);
    }
>>>>>>> f1dcd90883c5856c2e4238e3bf0441363caa41db
}