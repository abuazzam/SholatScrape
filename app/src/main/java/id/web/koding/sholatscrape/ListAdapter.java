package id.web.koding.sholatscrape;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Sholat> {
    public ListAdapter(Context context, ArrayList<Sholat> arrSholat) {
        super(context, 0, arrSholat);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);
        }

        TextView tvLabel = convertView.findViewById(R.id.tv_label);
        TextView tvWaktu = convertView.findViewById(R.id.tv_waktu);

        Sholat sholat = getItem(position);

        tvLabel.setText(sholat.title);
        tvWaktu.setText(sholat.time);

        return convertView;
    }
}
