package zyt.demo.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import zyt.demo.R;

/**
 * Created by zyt on 2017/3/26 21:02.
 */

public class DemoActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_demo);
        Button startService = (Button) findViewById(R.id.start_service);
        Button stopService = (Button) findViewById(R.id.stop_service);
        startService.setOnClickListener(this);
        stopService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_service:
                startService(new Intent(this, DemoService.class));
                break;
            case R.id.stop_service:
                stopService(new Intent(this, DemoService.class));
                break;
        }
    }
}
