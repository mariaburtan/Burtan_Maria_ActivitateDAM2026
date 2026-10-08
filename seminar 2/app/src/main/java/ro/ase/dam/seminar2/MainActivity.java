package ro.ase.dam.seminar2;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
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

}