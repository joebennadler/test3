package edu.gatech.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class TemperatureActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperature);
	}
	
	public void handleClick(View view){
		Boolean checked = ((RadioButton) view).isChecked();
		EditText myEditText = (EditText) findViewById(R.id.editText1);
		
		//try catch block to catch cases where:
			// A) User changes radio button without entering anything in EditText
			// B) User enters characters in EditText that can't be parsed as a Double value
		
		//Catch statement below returns method without performing any action
		
		try{
		Double unit = Double.parseDouble(myEditText.getText().toString());

		switch(view.getId())
		{
		case R.id.radio0:
			if(checked)
			{
				myEditText.setText(celToFar(unit));  
				break;
			}
		
		case R.id.radio1:
			if(checked){
				
			myEditText.setText(farToCel(unit));
			break;
		}
		}
		}
		
		//returns method without performing any action
		catch(Exception e){
			return;
		}
		
	}
	

	protected String celToFar(double cel){
		double far = cel*1.8 + 32;
		return String.valueOf(far);
	}
	
	protected String farToCel(double far){
		double cel = (far-32)/1.8;
		return String.valueOf(cel);
	}

}
