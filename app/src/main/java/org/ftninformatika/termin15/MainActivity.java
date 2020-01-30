package org.ftninformatika.termin15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    private List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems=findViewById(R.id.lwItems);
        data = getData();
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, data);
        lvItems.setAdapter(adapter);

    }

    private List<String> getData(){
        List<String> dummyData = new ArrayList<>();
        for (int i=20;i>0;i--){
            dummyData.add("Element "+ i);
        }
        return dummyData;
    }
}
