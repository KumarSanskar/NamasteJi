package sanskar.kumar.KumarSanskar.namasteji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference variable of the button class

        //Button sayNamasteButton;
        Button sayNamasteButton = findViewById(R.id.sayNamasteButton);
    }

    public void showNamasteMessage(View view){
        //toast message on pressing the button.
        Toast.makeText(this,"Namste ji",Toast.LENGTH_LONG).show();
    }
}