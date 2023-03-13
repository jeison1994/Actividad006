package com.example.actividad006;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText et1;
 private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 et1=(EditText)findViewById(R.id.et1);
        num=(int)(Math.random()*100001);Toast.makeText(this,""+num,Toast.LENGTH_LONG).show();
    }

    public void controlar(View view) {
     int valorIngresado;
     valorIngresado=Integer.parseInt(et1.getText().toString());
        if (valorIngresado==num) {
            Toast.makeText(this,"Muy bien recordaste el número mostrado", Toast.LENGTH_LONG).show();

        }else {
            Toast.makeText(this,"Lo siento pero no es el número que mostré.\", ", Toast.LENGTH_LONG).show();
        }
    }
}
