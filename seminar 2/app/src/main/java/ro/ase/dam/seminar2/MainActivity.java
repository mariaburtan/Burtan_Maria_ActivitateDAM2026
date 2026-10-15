package ro.ase.dam.seminar2;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
=======
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
>>>>>>> f1dcd90883c5856c2e4238e3bf0441363caa41db
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Verbose seminar", "On Create");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Info seminar", "On start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("Warning seminar", "On Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Debug seminar", "On Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Err seminar","On stop!");
    }

<<<<<<< HEAD
    public void deschideActivitate(View view)
    {
        Intent it=new Intent(this,ActivitateRezultat.class);
        Bundle bundle=new Bundle();
        bundle.putString("mesaj", "Mesaj din activitate noua"); //dictionar - informatii pe baza de cheie
        bundle.putInt("nr1", 5); //cheie si int
        bundle.putInt("nr2",7);

        it.putExtras(bundle); //adaugam informatiile in bundle si bundle u la intent

        startActivityForResult(it,83);
        //startActivity(it);//deschidere independenta
    }



}
//show dependent - tb sa primesc ceva (param rezultat) - startActivity for result
//showDialog independent - separate (startActivity)

//stiva de activitati

=======
}
>>>>>>> f1dcd90883c5856c2e4238e3bf0441363caa41db
