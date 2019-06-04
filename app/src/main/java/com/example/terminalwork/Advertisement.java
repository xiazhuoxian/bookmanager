package com.example.terminalwork;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Advertisement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertisement);

        Button Return=(Button)findViewById(R.id.Return);
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Advertisement",false);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        Button Advertisement=(Button)findViewById(R.id.Advertisement);
        Advertisement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_adver=new Intent();
                intent_adver.setAction("android.intent.action.VIEW");
                Uri uri=Uri.parse("http://www.baidu.com");
                intent_adver.setData(uri);
                startActivity(intent_adver);
            }
        });

        new Handler().postDelayed(new ReturnMainActivity(),3000);

    }

    private class ReturnMainActivity implements Runnable{
        @Override
        public void run() {
            Intent intent = new Intent();
            intent.putExtra("Advertisement",false);
            setResult(RESULT_OK,intent);
            finish();
        }
    }

}
