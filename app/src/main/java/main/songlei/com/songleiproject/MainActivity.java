package main.songlei.com.songleiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    private void test() {
        Toast.makeText(MainActivity.this,"git尝试",0).show();
        Toast.makeText(MainActivity.this,"git尝试1",0).show();
        Toast.makeText(MainActivity.this,"git尝试2",0).show();
    }
}
