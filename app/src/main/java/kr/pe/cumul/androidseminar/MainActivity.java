package kr.pe.cumul.androidseminar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        TextView textView = new TextView(this);
        textView.setText("Hello Android");

        layout.addView(textView);

        setContentView(layout);
    }
}
