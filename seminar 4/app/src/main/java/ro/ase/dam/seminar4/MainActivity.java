package ro.ase.dam.seminar3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

    public void CulegereDate(View view)
    {
        EditText et=findViewById(R.id.nume_et);
        CheckBox cb=findViewById(R.id.esteZi_cb);
        String nume=et.getText().toString(); //editabil
        Boolean esteZi=cb.isChecked();

        Intent it=new Intent(MainActivity.this, NouaActivitate.class);
        startActivityForResult(it,34);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==34 && resultCode==RESULT_OK)
        {
            if(data!=null)
            {
                CutieBomboane cutie=(CutieBomboane) data.getSerializableExtra("rezultat_cutie");
                if(cutie!=null)
                    Toast.makeText(this,"Primit: "+cutie.getMarca(), Toast.LENGTH_LONG).show();
            }
        }
    }

    public void deschideActivitate(View view)
    {
        Intent it=new Intent(this, NouaActivitate.class);
        startActivityForResult(it,34);
    }


}