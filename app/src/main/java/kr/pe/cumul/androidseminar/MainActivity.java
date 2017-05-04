package kr.pe.cumul.androidseminar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        RecyclerView recyclerView = new RecyclerView(this);
        layout.addView(recyclerView);

        RecyclerAdapter adapter = new RecyclerAdapter(this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        setContentView(layout);

        adapter.add(new Lecture("자료구조", "안형찬"));
        adapter.add(new Lecture("윤리학", "김형철"));
        adapter.add(new Lecture("논리학", "최동호"));
    }
}
