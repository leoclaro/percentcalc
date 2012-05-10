package com.projetoteste;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class ProjetoTesteActivity extends Activity {
	ImageButton btnTeste;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnTeste = (ImageButton) findViewById(R.id.imageButton1);

        btnTeste.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	btnTeste.setBackgroundResource(R.drawable.btn);
            	fecharAplicacao();
            }
        });
    } 
    public void fecharAplicacao(){    	
    	AlertDialog.Builder dialog = new AlertDialog.Builder(this);
		dialog.setMessage("Deseja realmente sair desta aplicação?");
		dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {			 
			public void onClick(DialogInterface di, int arg) {    				 
				finish();			 
			}
		});
		dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {			
			public void onClick(DialogInterface arg0, int arg1) {				
			}
		});
		dialog.setTitle("Fechar aplicação");
		dialog.show();    	
    }    
}