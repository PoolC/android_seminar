package kr.pe.cumul.androidseminar;

import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView titleView;
    private TextView profView;

    public RecyclerViewHolder(LinearLayout layout, TextView titleView, TextView profView) {
        super(layout);
        this.titleView = titleView;
        this.profView = profView;
    }

    public void setTitle(String title) {
        titleView.setText(title);
    }

    public void setProf(String prof) {
        profView.setText(prof);
    }
}
