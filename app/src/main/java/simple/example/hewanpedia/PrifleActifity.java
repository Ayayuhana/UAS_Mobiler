package simple.example.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import simple.example.hewanpedia.model.Pakaian;

public class PrifleActifity extends AppCompatActivity {
    Pakaian pakaian;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView pakaianivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        pakaian = (Pakaian) intent.getSerializableExtra(DaftarAlaskaki.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(pakaian);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        pakaianivFotoHewan = findViewById(R.id.gambarHewan);
    }


    private void tampilkanProfil(Pakaian pakaian) {
        Log.d("Profil","Menampilkan "+ pakaian.getJenis());
        txJudul.setText(pakaian.getJenis());
        txJenis.setText(pakaian.getRas());
        txAsal.setText(pakaian.getAsal());
        txDeskripsi.setText(pakaian.getDeskripsi());
        pakaianivFotoHewan.setImageDrawable(this.getDrawable(pakaian.getDrawableRes()));
    }

}
