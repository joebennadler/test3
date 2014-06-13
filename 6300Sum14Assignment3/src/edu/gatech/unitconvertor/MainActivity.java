package edu.gatech.unitconvertor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void handleDistanceClick(View view){
		Intent intent = new Intent(this,DistanceActivity.class);
		startActivity(intent);
	}
	
	public void handleWeightClick(View view){
		Intent intent = new Intent(this,WeightActivity.class);
		startActivity(intent);
	}
	
	public void handleTemperatureClick(View view){
		Intent intent = new Intent(this,TemperatureActivity.class);
		startActivity(intent);
	}
}
