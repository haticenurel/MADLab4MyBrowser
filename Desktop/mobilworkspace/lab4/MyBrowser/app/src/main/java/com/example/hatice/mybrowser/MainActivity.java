package com.example.hatice.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //11.adım
    Button btnGo;
    EditText address;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //11.adım
        btnGo = findViewById(R.id.go);
        address = findViewById(R.id.address);
        webView = findViewById(R.id.webview);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.loadUrl("http://" + address.getText());
            }
        });
        //14.adım
        if (getIntent()!= null && getIntent().getData() != null){
            address.setText(getIntent().getData().toString());
            webView.loadUrl(getIntent().getData().toString());

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

}