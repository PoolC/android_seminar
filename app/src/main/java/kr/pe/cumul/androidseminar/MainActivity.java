package kr.pe.cumul.androidseminar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        ListView listView = new ListView(this);
        ListAdapter adapter = new ListAdapter(this);
        listView.setAdapter(adapter);

        layout.addView(listView);

        setContentView(layout);

        adapter.add("자료구조");
        adapter.add("윤리학");
        adapter.add("논리학");
    }
}
