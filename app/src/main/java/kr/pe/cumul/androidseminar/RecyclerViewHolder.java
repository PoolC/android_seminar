package kr.pe.cumul.androidseminar;

import android.support.v7.widget.RecyclerView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private CheckBox doneView;
    private TextView titleView;

    public RecyclerViewHolder(LinearLayout layout, CheckBox doneView, TextView titleView) {
        super(layout);
        this.doneView = doneView;
        this.titleView = titleView;
    }

    public void setDone(boolean done) {
        doneView.setChecked(done);
    }

    public void setTitle(String title) {
        titleView.setText(title);
    }
}
