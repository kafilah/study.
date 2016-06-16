package sample.fabrics.io.study;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by earlybirdcamp on 6/15/16.
 */
class CustomAdapter extends ArrayAdapter<String> {


    int hour;
    int mins;

    CustomAdapter(Context context, String[] foods){
        super(context, R.layout.custom_row, foods);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater cellInflater = LayoutInflater.from(getContext());
        View customView = cellInflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView date = (TextView) customView.findViewById(R.id.firstLine);
        TextView time = (TextView) customView.findViewById(R.id.time);
        TextView productivity = (TextView) customView.findViewById(R.id.secondLine);
        TextView totalTime = (TextView) customView.findViewById(R.id.thirdLine);

        productivity.setText(singleFoodItem);
        hour = (int) ((Math.random() * 12) + 1 );
        mins = (int) ((Math.random() * 60) + 1);
        time.setText(""+ String.format("%02d", hour) + ":" + String.format("%02d", mins));
        return customView;

    }
}
