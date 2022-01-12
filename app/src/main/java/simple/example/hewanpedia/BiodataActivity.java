package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BiodataActivity extends AppCompatActivity {

    private Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        back = (Button) findViewById(R.id.kembali_btn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(BiodataActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}