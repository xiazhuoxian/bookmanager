package com.example.terminalwork;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import org.litepal.crud.DataSupport;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Fragment_HomePage extends Fragment {

    private List<RecyclerView_HomePage> booklist=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.statebar_homepage,container,false);
        return view;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initBooks();
        RecyclerView recyclerView=(RecyclerView)getActivity().findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        Adapter_HomePage adapter=new Adapter_HomePage(booklist);
        recyclerView.setAdapter(adapter);
    }

    private void initBooks(){
        List<Data_Book> books =DataSupport.findAll(Data_Book.class);

        //添加头部图片
        //通过图片的名，图片的存储位置，和项目名 得到 与书名相匹配的 图片的id
        int imageId_header = getResources().getIdentifier("header", "drawable", "com.example.terminalwork");
        RecyclerView_HomePage header=new RecyclerView_HomePage("header",imageId_header);
        booklist.add(header);

        //添加 长篇小说
        int imageId_novel = getResources().getIdentifier("san_guo_yan_yi", "drawable", "com.example.terminalwork");
        RecyclerView_HomePage novel=new RecyclerView_HomePage("三国演义",imageId_novel);
        booklist.add(novel);

        //添加 热门图书
        int imageId_popularBook = getResources().getIdentifier("chong_xin_li_jie", "drawable", "com.example.terminalwork");
        RecyclerView_HomePage popularBook=new RecyclerView_HomePage("重新理解创业 ：一个创业者的途中思考",imageId_popularBook);
        booklist.add(popularBook);


        //加RecyclerView长度
        //添加 长篇小说
       /* int imageId_novel1 = getResources().getIdentifier("san_guo_yan_yi", "drawable", "com.example.terminalwork");
        RecyclerView_HomePage novel1=new RecyclerView_HomePage("三国演义",imageId_novel);
        booklist.add(novel1);

        //添加 热门图书
        int imageId_popularBook1 = getResources().getIdentifier("chong_xin_li_jie", "drawable", "com.example.terminalwork");
        RecyclerView_HomePage popularBook1=new RecyclerView_HomePage("重新理解创业 ：一个创业者的途中思考",imageId_popularBook);
        booklist.add(popularBook1);*/


        /*for(Data_Book book:books){
            //通过图片的名，图片的存储位置，和项目名 得到 与书名相匹配的 图片的id
            int imageId = getResources().getIdentifier(book.getB_picture(), "drawable", "com.example.terminalwork");
            RecyclerView_HomePage a=new RecyclerView_HomePage(book.getB_name(),imageId);
            booklist.add(a);
        }*/

    }

}
