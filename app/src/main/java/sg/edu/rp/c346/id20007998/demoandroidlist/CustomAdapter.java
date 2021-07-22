package sg.edu.rp.c346.id20007998.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context context;
    int layout_id;
    ArrayList<AndroidVersion>al;

    public CustomAdapter(Context context, int resource,ArrayList<AndroidVersion>al) {
        super(context, resource, al);

        this.context=context;
        this.layout_id=resource;
        this.al=al;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //R.Layout.row
        View rowView = inflater.inflate(layout_id,parent,false);
        //inflate the view for each row
        //line 32 and 34 will always exist and has no change to it.

        TextView tvName=rowView.findViewById(R.id.tvName);
        TextView tvVersion=rowView.findViewById(R.id.tvVersion);
        //Obtain UI component and do the necessary binding.

        AndroidVersion currentVersion=al.get(position);

        tvName.setText(currentVersion.getName());
        tvVersion.setText(currentVersion.getVersion());

        return rowView;
    }
}
