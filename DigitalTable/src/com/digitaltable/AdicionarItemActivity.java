package com.digitaltable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AdicionarItemActivity extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView textview = new TextView(this);
        textview.setText("Adicionar ");
        setContentView(textview);
    }
}
