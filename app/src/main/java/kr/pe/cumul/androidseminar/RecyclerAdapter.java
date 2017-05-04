package kr.pe.cumul.androidseminar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private Context context;
    private ArrayList<Todo> items;

    public RecyclerAdapter(Context context) {
        super();
        this.context = context;
        this.items = new ArrayList<>();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void add(Todo item) {
        items.add(item);
        notifyItemInserted(items.size() - 1);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        CheckBox doneView = new CheckBox(context);
        layout.addView(doneView);

        TextView titleView = new TextView(context);
        layout.addView(titleView);

        return new RecyclerViewHolder(layout, doneView, titleView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Todo item = items.get(position);

        holder.setTitle(item.getTitle());
        holder.setDone(item.isDone());
    }
}
