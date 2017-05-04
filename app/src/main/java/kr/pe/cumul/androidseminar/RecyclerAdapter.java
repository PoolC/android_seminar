package kr.pe.cumul.androidseminar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private Context context;
    private ArrayList<Lecture> items;

    public RecyclerAdapter(Context context) {
        super();
        this.context = context;
        this.items = new ArrayList<>();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void add(Lecture item) {
        items.add(item);
        notifyItemInserted(items.size() - 1);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);

        TextView titleView = new TextView(context);
        titleView.setTextSize(24f);
        layout.addView(titleView);

        TextView profView = new TextView(context);
        profView.setTextSize(16f);
        layout.addView(profView);

        return new RecyclerViewHolder(layout, titleView, profView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Lecture item = items.get(position);

        holder.setTitle(item.getTitle());
        holder.setProf(item.getProf());
    }
}
