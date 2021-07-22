package sg.edu.rp.c346.id20007998.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<AndroidVersion> al;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);

        al=new ArrayList<>();

        al.add(new AndroidVersion("Pie","9.0"));
        al.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        al.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

        ca=new CustomAdapter(this, R.layout.row,al);

        lv.setAdapter(ca);

    }
}