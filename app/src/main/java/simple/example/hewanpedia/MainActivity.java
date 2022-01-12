package simple.example.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button biodata, mediasosial;
    ImageButton btnBaju,btnCelana, btnRok;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

        biodata = (Button) findViewById(R.id.biodata_btn);
        mediasosial = (Button) findViewById(R.id.koleksi_btn);


        biodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, BiodataActivity.class);
                startActivity(intent);
            }
        });

        mediasosial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SosmedActivity.class);
                startActivity(intent);

            }
        });


    }

    private void inisialisasiView() {
        btnBaju = findViewById(R.id.btn_buka_model_baju);
        btnCelana = findViewById(R.id.btn_buka_model_celana);
        btnRok = findViewById(R.id.btn_buka_model_rok);
        btnBaju.setOnClickListener(view -> bukaGaleri("Dress"));
        btnCelana.setOnClickListener(view -> bukaGaleri("Trausers"));
        btnRok.setOnClickListener(view -> bukaGaleri("Years"));

    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity kucing");
        Intent intent = new Intent(this, DaftarAlaskaki.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}