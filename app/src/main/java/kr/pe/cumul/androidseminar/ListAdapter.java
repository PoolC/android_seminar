package kr.pe.cumul.androidseminar;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<String> {

    public ListAdapter(Context context) {
        super(context, android.R.layout.simple_list_item_1, new ArrayList<String>());
    }
}
