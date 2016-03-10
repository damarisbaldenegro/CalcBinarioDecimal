package com.example.usuario.convertidor;

import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class resultado_Convertidor extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultadoconvertidor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView txtBinario = (TextView) findViewById(R.id.txtVbinario);
        Intent act = getIntent();
        String s = getIntent().getStringExtra("TextValue");
        txtBinario.setText(s);

        TextView txtDecimal = (TextView) findViewById(R.id.txtVDec);
        Intent act1 = getIntent();
        String s1 = getIntent().getStringExtra("TextValue1");
        txtDecimal.setText(s1);


    }
}
