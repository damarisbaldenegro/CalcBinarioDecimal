package com.example.usuario.convertidor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener {
    static  String text;
    int valor =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnbinario = (Button) findViewById(R.id.btnBinario);
        btnbinario.setOnClickListener(this);
        Button btndecimal = (Button) findViewById(R.id.btnDecimal);
        btndecimal.setOnClickListener(this);
        EditText txtfieldnumeros = (EditText) findViewById(R.id.txtfieldNumeros);


    }




    public void onClick(View v) {
        Button btndecimal = (Button) findViewById(R.id.btnDecimal);
        Button btnbinario = (Button) findViewById(R.id.btnBinario);
        EditText txtfieldnumeros = (EditText) findViewById(R.id.txtfieldNumeros);

            if (v.getId() == R.id.btnBinario) {
                    text = txtfieldnumeros.getText().toString();
                     int maxLength = 10;
                    // text.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
                if (txtfieldnumeros.getText().toString().isEmpty() ) {
                    txtfieldnumeros.setError("Ingresa un numero binario");
                    return;
                }
                else {

                    valor = Integer.parseInt(text);
                    String Res = Integer.toBinaryString(valor);
                    Intent act = new Intent (this,resultado_Convertidor.class);
                    act.putExtra("TextValue", Res);
                    startActivity(act);
                    txtfieldnumeros.setText("");
                }

            }

            if (v.getId() == R.id.btnDecimal) {

                    text = txtfieldnumeros.getText().toString();
                if (txtfieldnumeros.getText().toString().isEmpty()) {
                    txtfieldnumeros.setError("Ingresa un numero decimal");
                    return;
                } else {
                    if (text.contains("0") && text.contains("1")  ) {
                        valor = Integer.parseInt(text, 2);
                        String Result = Integer.toString(valor);
                        Intent act1 = new Intent (this,resultado_Convertidor.class);
                        act1.putExtra("TextValue1", Result);
                        startActivity(act1);
                        txtfieldnumeros.setText("");



                    }else{
                        txtfieldnumeros.setError("Ingresa un numero binario");
                        return;
                    }
                }


            }

        }
    }




