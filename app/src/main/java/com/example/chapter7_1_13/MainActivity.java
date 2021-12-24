package com.example.chapter7_1_13;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baselayout;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("옵션메뉴 다루기 예제 = 13번");

        baselayout =(LinearLayout) findViewById(R.id.baselayout);
        btn1 = (Button) findViewById(R.id.btn1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.itemred:
                baselayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemgreen:
                baselayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemblue:
                baselayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subrotate:
                float rotate = btn1.getRotation()+45;
                btn1.setRotation(rotate);
                return true;
            case R.id.subsize:
                btn1.setScaleX(2);
                btn1.setScaleY(2);
                return true;
        }
        return false;
    }
}