package com.example.proba;



import com.example.proba.*;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class LogoActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.layout_log);
		
	    Thread splashThread = new Thread(){
	         @Override
	         public void run(){
	        	 boolean active = true;
	        	 int splashTime = 3000 ;
	          try{
	           int waited = 0;
	           while(active && (waited < splashTime)){
	            sleep(100);
	            if(active){
	             waited += 100;
	            }
	            
	           }
	          } catch(InterruptedException e){
	           
	          } finally{
	           openApp();
	          }
	          
	         }
	        };
	        splashThread.start();
	    }
	    
	private void openApp(){
	     finish();
	        startActivity(new Intent(this,MainActivity.class));
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
		if (id == R.id.main_1) {
				return true;
		}
	//	if (id == R.id.main_1_1 || id == R.id.main_1_2 || R.id.main_1_3) 
		if (id == R.id.main_2) {
			Intent i= new Intent (this, MapActivity.class) ; 
			startActivity (i) ;		
			return true;
		}
		if (id == R.id.main_3) {
	      
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
