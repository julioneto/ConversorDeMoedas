package com.example.designer.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ViewHolder nViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nViewHolder.editValor  = (EditText) findViewById(R.id.edit_valor);
        this.nViewHolder.textDollar = (TextView) findViewById(R.id.text_dollar);
        this.nViewHolder.textEuro   = (TextView) findViewById(R.id.text_euro);
        this.nViewHolder.buttonCalc = (Button) findViewById(R.id.button_calcular);

        this.nViewHolder.buttonCalc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_calcular) {
            Double valor = Double.valueOf(this.nViewHolder.editValor.getText().toString());
            this.nViewHolder.textDollar.setText(String.format("%.2f", valor * 3));
            this.nViewHolder.textEuro.setText(String.format("%.2f", valor * 4));
        }
    }


    private static class ViewHolder {
        EditText editValor;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalc;
    }
}
