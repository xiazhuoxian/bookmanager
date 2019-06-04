package com.example.terminalwork;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private boolean Advertisement=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Advertisement){
            Intent intent_Advertisement=new Intent(MainActivity.this,Advertisement.class);
            startActivityForResult(intent_Advertisement,1);
        }

        Button Homepage=(Button)findViewById(R.id.HomePage);
        Button BookShelf=(Button)findViewById(R.id.BookShelf);
        Button Discovery=(Button)findViewById(R.id.Discovery);
        Button My=(Button)findViewById(R.id.My);
        Homepage.setOnClickListener(this);
        BookShelf.setOnClickListener(this);
        Discovery.setOnClickListener(this);
        My.setOnClickListener(this);

        replaceFragment(new Fragment_HomePage());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.HomePage:
                replaceFragment(new Fragment_HomePage());
                break;
            case R.id.BookShelf:
                replaceFragment(new Fragment_BookShelf());
                break;
            case R.id.Discovery:
                replaceFragment(new Fragment_Discovery());
                break;
            case R.id.My:
                replaceFragment(new Fragment_My());
                break;
            default:
                break;
        }

    }


    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.Page,fragment);
        transaction.commit();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode){
            case 1:
                Advertisement=data.getBooleanExtra("Advertisement",false);
                break;
        }
    }
}
