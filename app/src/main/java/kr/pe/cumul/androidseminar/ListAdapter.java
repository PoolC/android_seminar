package kr.pe.cumul.androidseminar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Lecture> items;

    public ListAdapter(Context context) {
        super();
        this.context = context;
        this.items = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Lecture getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void add(Lecture item) {
        items.add(item);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Lecture item = getItem(position);

        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);

        TextView titleView = new TextView(context);
        titleView.setText(item.getTitle());
        titleView.setTextSize(24f);
        layout.addView(titleView);

        TextView profView = new TextView(context);
        profView.setText(item.getProf());
        profView.setTextSize(16f);
        layout.addView(profView);

        return layout;
    }
}
