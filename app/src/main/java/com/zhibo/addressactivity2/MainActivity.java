package com.zhibo.addressactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RegionalChooseUtil.initJsonData(MainActivity.this);


        findViewById(R.id.choose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RegionalChooseUtil.showPickerView(MainActivity.this, new MyCallBack() {
                    @Override
                    public void callBack(Object object) {
                        Toast.makeText(MainActivity.this, object.toString(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

}
