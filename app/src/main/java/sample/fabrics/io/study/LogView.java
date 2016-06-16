package sample.fabrics.io.study;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LogView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_view);
//asdfsdf
        String[] foods = {"Bacon", "Yogurt", "Yolo", "Test", "Test2", "Test3", "Test4", "Test5", "Test6",
                "Test7", "Test8", "Test9", "Test10", "Test11", "Test12", "Test13", "Test"};
        ListAdapter cellAdapter = new CustomAdapter(this, foods);
        ListView cellListView = (ListView) findViewById(R.id.buckys_list_view);
        cellListView.setAdapter(cellAdapter);
        cellListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String food = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(LogView.this, food, Toast.LENGTH_LONG).show();

            }
        });

    }
}

