package com.dridimedamine.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id =item.getItemId();

        if (id==R.id.menu_home)

            Toast.makeText(this,"home",Toast.LENGTH_SHORT).show();

        if (id==R.id.itemA)
            Toast.makeText(this,"itemA",Toast.LENGTH_SHORT).show();

        if
            (id == R.id.itemB)
            finish();
           // Toast.makeText(this, "item b", Toast.LENGTH_SHORT).show();

        if (id==R.id.setting)
            Toast.makeText(this,"setting",Toast.LENGTH_SHORT).show();


        return super.onOptionsItemSelected(item);
    }


}
