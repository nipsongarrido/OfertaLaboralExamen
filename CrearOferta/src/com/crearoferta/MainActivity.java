package com.crearoferta;

import webservice.Servicios;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
	private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText detalle = (EditText)findViewById(R.id.detalle);
        final EditText mail = (EditText)findViewById(R.id.email);
        final EditText vigencia = (EditText)findViewById(R.id.vigencia);
        Button btn = (Button)findViewById(R.id.button1);
        result = (TextView)findViewById(R.id.mensaje);
 
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Servicios serv = new Servicios();
            	String mensaje = serv.crearOferta(detalle.getText().toString(), mail.getText().toString(), vigencia.getText().toString(), "");
            	result.setText(mensaje);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
