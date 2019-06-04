package com.example.terminalwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.litepal.crud.DataSupport;

import java.util.List;

public class BookPage extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView_name;
    private TextView textView_actor;
    private TextView textView_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);
        imageView=(ImageView)findViewById(R.id.BookPage_ImageView);
        textView_name=(TextView)findViewById(R.id.BookPage_Name);
        textView_actor=(TextView)findViewById(R.id.BookPage_Actor);
        textView_content=(TextView)findViewById(R.id.BookPage_Content);

        Intent intent_name=getIntent();
        String BookName=intent_name.getStringExtra("BookName");

        List<Data_Book> books =DataSupport.where("b_name = ?",BookName).find(Data_Book.class);
        for(Data_Book book:books){
            int imageId = getResources().getIdentifier(book.getB_picture(), "drawable", "com.example.terminalwork");
            imageView.setImageResource(imageId);
            textView_name.setText(BookName);
            textView_actor.setText(book.getB_actor());
            textView_content.setText(book.getB_content());
            break;
        }

        Button finish=(Button)findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
