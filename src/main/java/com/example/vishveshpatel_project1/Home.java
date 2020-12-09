package com.example.vishveshpatel_project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends Fragment {
    ImageView iv1,iv2,iv3,iv4;
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home,container,false);

        iv1=v.findViewById(R.id.imageView4);
        iv2=v.findViewById(R.id.imageView5);
        iv3=v.findViewById(R.id.imageView8);
        iv4=v.findViewById(R.id.imageView9);
        tv=v.findViewById(R.id.textView6);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Fragment fragment = new products();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frameLayout,fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Home");
    }
}
