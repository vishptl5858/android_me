package com.example.vishveshpatel_project1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;

public class S_phone extends Fragment {
    Button checkout;
    TextView tv,tv2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.samsung_phones, container, false);

        checkout=v.findViewById(R.id.checkout);
        tv=v.findViewById(R.id.textView16);
        tv2=v.findViewById(R.id.textView15);

        String[] word = { "Name : Samsung Galaxy M10"};
        String[] price = {"Price : $1000"};

        tv.setText(Arrays.toString(word));
        tv2.setText(Arrays.toString(price));
        tv.setText(Arrays.toString(word).replaceAll("\\[|\\]", ""));
        tv2.setText(Arrays.toString(price).replaceAll("\\[|\\]", ""));


        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phonename=tv.getText().toString();
                String phoneprice=tv2.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("phonename",phonename);
                bundle.putString("phoneprice",phoneprice);
                Fragment fragment = new checkout_activity();
                fragment.setArguments(bundle);
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frameLayout,fragment);
                ft.addToBackStack(null);
                ft.commit();



            }
        });
        return  v;
    }
}
