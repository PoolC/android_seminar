package kr.pe.cumul.androidseminar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(
                RecyclerView.LayoutParams.MATCH_PARENT,
                RecyclerView.LayoutParams.WRAP_CONTENT
        ));
        layout.addView(recyclerView);

        RecyclerAdapter adapter = new RecyclerAdapter(this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        setContentView(layout);

        adapter.add(new Todo("자료구조 과제", false));
        adapter.add(new Todo("윤리학 쪽글", false));
        adapter.add(new Todo("논리학 연습문제", true));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add("추가");
        add.setIcon(R.drawable.ic_add_white_24dp);
        add.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        return true;
    }
}
