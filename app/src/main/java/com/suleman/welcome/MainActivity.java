package com.suleman.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btnclick;
    EditText edtname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclick= (Button) findViewById(R.id.btnclick);


    }
    public void displayMessage(View v)
    {
        edtname= (EditText) findViewById(R.id.edtname);
        String name=edtname.getText().toString();
        Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();
    }
}
