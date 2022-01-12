package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class SosmedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosmed);

        TextView textView = findViewById(R.id.isntagram);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}