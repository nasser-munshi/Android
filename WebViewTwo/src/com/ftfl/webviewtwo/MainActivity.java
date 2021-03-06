package com.ftfl.webviewtwo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	
	@Override
	public void onStart() {
        super.onStart();

        WebView webView =  (WebView)findViewById(R.id.webView1);
        //enable JavaScript
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new java2JSAgent(), "java2JSAgentVar");
        webView.loadUrl("file:///android_asset/index.html");
    }
	
	public class java2JSAgent
    {
        public String getContacts()
        {
            String jsonResponse = null;
            //call Android APIs to get contacts
            //serialize to JSON and assign to jsonResponse

            return jsonResponse;
        }
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
