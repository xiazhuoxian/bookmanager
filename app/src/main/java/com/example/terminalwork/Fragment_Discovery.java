package com.example.terminalwork;

        import android.os.Bundle;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;

public class Fragment_Discovery extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.statebar_discovery,container,false);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button=(Button)getActivity().findViewById(R.id.create);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data_Book book= new Data_Book();
                book.setB_id(14);
                book.setB_name("希腊人的故事");
                book.setB_picture("xi_la_ren");
                book.setB_actor("盐野七生");

                book.setB_content("《希腊人的故事》是盐野七生的封笔之作，继《罗马人的故事》之后备受大众欢迎的历史作品系列。在这部《希腊人的故事》中，作者将我们带回那个人与神共处同一片天地的传奇时代，冷静透彻地将视角集中于多元文明如何共存，场景再现般地讲述在一次次改变世界格局的决策中，性格迥异的英雄们如何引领国家走向。");
                book.setB_type("热门图书");
                book.save();
            }
        });
    }
}