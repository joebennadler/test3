package edu.gatech.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class WeightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
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
				myEditText.setText(kgToPounds(unit));  
				break;
			}
		
		case R.id.radio1:
			if(checked){
				
			myEditText.setText(poundsToKG(unit));
			break;
		}
		}
		}
		
		//returns method without performing any action
		catch(Exception e){
			return;
		}
		
	}
	
	protected String kgToPounds(double kg){
		double pounds = kg*2.2046;
		return String.valueOf(pounds);
	}
	
	protected String poundsToKG(double pounds){
		double kg = pounds/2.2046;
		return String.valueOf(kg);
	}

}
