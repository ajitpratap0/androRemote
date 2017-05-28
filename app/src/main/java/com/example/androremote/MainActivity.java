package com.example.androremote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener {

    public static String ip;
    Button bconnect;
    EditText textField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textField = (EditText) findViewById(R.id.editText1);
        bconnect = (Button) findViewById(R.id.button1);
        bconnect.setOnClickListener(this);
    }

    public void onClick(View v) {
        ip = textField.getText().toString();
        Intent intent = new Intent(this, Client.class);
        startActivity(intent);
    }

}
