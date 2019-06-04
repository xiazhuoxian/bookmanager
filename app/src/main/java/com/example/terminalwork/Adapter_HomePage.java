package com.example.terminalwork;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.litepal.crud.DataSupport;

import java.util.List;

public class Adapter_HomePage extends RecyclerView.Adapter <RecyclerView.ViewHolder> {

    private List<RecyclerView_HomePage> mBookList;
    private List<RecyclerView_HomePage> mBookList_hor;

    private class ViewHolder_header extends RecyclerView.ViewHolder{
        View bookView;
        ImageView BookImage;

        public ViewHolder_header(View view) {
            super(view);
            bookView=view;
            BookImage = (ImageView) view.findViewById(R.id.HomePage_image_header);
        }
    }

    private class ViewHolder_four extends RecyclerView.ViewHolder{
        View bookView;
        ImageView BookImage_1;
        TextView BookName_1;
        ImageView BookImage_2;
        TextView BookName_2;
        ImageView BookImage_3;
        TextView BookName_3;
        ImageView BookImage_4;
        TextView BookName_4;

        public ViewHolder_four(View view) {
            super(view);
            bookView=view;
            BookImage_1 = (ImageView) view.findViewById(R.id.four_image_1);
            BookName_1=(TextView)view.findViewById(R.id.four_name_1);
            BookImage_2 = (ImageView) view.findViewById(R.id.four_image_2);
            BookName_2=(TextView)view.findViewById(R.id.four_name_2);
            BookImage_3 = (ImageView) view.findViewById(R.id.four_image_3);
            BookName_3=(TextView)view.findViewById(R.id.four_name_3);
            BookImage_4 = (ImageView) view.findViewById(R.id.four_image_4);
            BookName_4=(TextView)view.findViewById(R.id.four_name_4);
        }
    }

    private class ViewHolder_three extends RecyclerView.ViewHolder{
        View bookView;
        ImageView BookImage_1;
        TextView BookName_1;
        ImageView BookImage_2;
        TextView BookName_2;
        ImageView BookImage_3;
        TextView BookName_3;

        ViewHolder_three(View view) {
            super(view);
            bookView=view;
            BookImage_1 = (ImageView) view.findViewById(R.id.HomePage_image_1);
            BookName_1=(TextView)view.findViewById(R.id.HomePage_name_1);
            BookImage_2 = (ImageView) view.findViewById(R.id.HomePage_image_2);
            BookName_2=(TextView)view.findViewById(R.id.HomePage_name_2);
            BookImage_3 = (ImageView) view.findViewById(R.id.HomePage_image_3);
            BookName_3=(TextView)view.findViewById(R.id.HomePage_name_3);
        }
    }




    public Adapter_HomePage(List<RecyclerView_HomePage> booklist){
        mBookList=booklist;
    }

    /*public Adapter_HomePage(List<RecyclerView_HomePage> booklist){
        mBookList=booklist;
    }*/

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        RecyclerView.ViewHolder holder=null;

            switch (viewType) {
                case 0: {
                    final View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_header, viewGroup, false);
                    final ViewHolder_header holder1 = new ViewHolder_header(view);
                    /*holder1.bookView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int position = holder1.getAdapterPosition();
                            RecyclerView_HomePage book = mBookList.get(position);
                            Intent intent = new Intent(view.getContext(), BookPage.class);
                            intent.putExtra("BookName", book.getName());
                            view.getContext().startActivity(intent);
                        }
                    });*/
                    holder = holder1;
                    break;
                }
                case 1: {
                    final View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_homepage_three, viewGroup, false);
                    final ViewHolder_three holder1 = new ViewHolder_three(view);
                    holder1.bookView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int position = holder1.getAdapterPosition();
                            RecyclerView_HomePage book = mBookList.get(position);
                            Intent intent = new Intent(view.getContext(), BookPage.class);
                            intent.putExtra("BookName", book.getName());
                            view.getContext().startActivity(intent);
                        }
                    });
                    holder = holder1;
                    break;
                }
                case 2:{
                    final View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_homepage_four, viewGroup, false);
                    final ViewHolder_four holder1 = new ViewHolder_four(view);
                    holder1.bookView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int position = holder1.getAdapterPosition();
                            RecyclerView_HomePage book = mBookList.get(position);
                            Intent intent = new Intent(view.getContext(), BookPage.class);
                            intent.putExtra("BookName", book.getName());
                            view.getContext().startActivity(intent);
                        }
                    });
                    holder = holder1;
                    break;
                }
        }
        return (RecyclerView.ViewHolder)holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView_HomePage book=mBookList.get(i);

        switch (getItemViewType(i)){
            case 0:
                final ViewHolder_header header=(ViewHolder_header) viewHolder;
                header.BookImage.setImageResource(book.getImageId());
                break;
            case 1:
                /*List<Data_Book> books =DataSupport.where("b_name = ?",book.getName()).limit(3).find(Data_Book.class);
                final ViewHolder_three holder_three=(ViewHolder_three) viewHolder;
                for(Data_Book book1:books){
                    holder_three.BookImage_1.setImageResource(book1.getB_id());
                    holder_three.BookName_1.setText(book1.getName());
                }*/

                final ViewHolder_three holder_three=(ViewHolder_three) viewHolder;
                holder_three.BookImage_1.setImageResource(book.getImageId());
                holder_three.BookName_1.setText(book.getName());
                holder_three.BookImage_2.setImageResource(book.getImageId());
                holder_three.BookName_2.setText(book.getName());
                holder_three.BookImage_3.setImageResource(book.getImageId());
                holder_three.BookName_3.setText(book.getName());
                break;
            case 2:
                final ViewHolder_four holder_four=(ViewHolder_four) viewHolder;
                holder_four.BookImage_1.setImageResource(book.getImageId());
                holder_four.BookName_1.setText(book.getName());
                holder_four.BookImage_2.setImageResource(book.getImageId());
                holder_four.BookName_2.setText(book.getName());
                holder_four.BookImage_3.setImageResource(book.getImageId());
                holder_four.BookName_3.setText(book.getName());
                holder_four.BookImage_4.setImageResource(book.getImageId());
                holder_four.BookName_4.setText(book.getName());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mBookList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return 0;
        }else if (position==1){
            return 1;
        }else {
            return 2;
        }
    }
}

