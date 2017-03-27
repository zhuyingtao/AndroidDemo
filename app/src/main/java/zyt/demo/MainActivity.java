package zyt.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import zyt.demo.service.DemoActivity;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private List<String> mListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        ListView listView = ((ListView) findViewById(R.id.list));
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                mListData));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) parent.getItemAtPosition(position);
                switch (value) {
                    case "Service":
                        startActivity(new Intent(MainActivity.this, DemoActivity.class));
                        break;
                }
            }
        });
    }

    public void initData() {
        mListData = new ArrayList<>();
        mListData.add("Service");
    }
}
