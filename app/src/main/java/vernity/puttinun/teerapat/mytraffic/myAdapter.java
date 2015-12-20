package vernity.puttinun.teerapat.mytraffic;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by acer on 20/12/2558.
 */
public class myAdapter extends BaseAdapter{

    // Explicit
    private Context objContext;
    private String[] title1Strings, title2Strings;
    private int[] iconInts;

    public myAdapter(Context objContext, String[] title1Strings, String[] title2Strings, int[] iconInts) {
        this.objContext = objContext;
        this.title1Strings = title1Strings;
        this.title2Strings = title2Strings;
        this.iconInts = iconInts;
    }   // Constructer;

    @Override
    public int getCount() {
        return title1Strings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.mylistview, parent, false);

        // For TextView
        TextView title1TextView = (TextView) objView1.findViewById(R.id.txtTitle1);
        title1TextView.setText(title1Strings[position]);

        TextView title2TextView = (TextView) objView1.findViewById(R.id.txtTitle2);
        title2TextView.setText(title2Strings[position]);

        // File Image
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconInts[position]);

        return objView1;
    }
}   // Main Class
