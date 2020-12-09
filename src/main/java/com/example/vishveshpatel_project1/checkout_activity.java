package com.example.vishveshpatel_project1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;

public class checkout_activity extends Fragment {

    Button b;
    TextView tv,tv2;
    Spinner sp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.checkout_activity, container, false);


        b=v.findViewById(R.id.button4);
        tv=v.findViewById(R.id.phoneName);
        tv2=v.findViewById(R.id.phonePrice);
        Bundle bundle = getArguments();
        tv.setText(String.valueOf(bundle.getString("phonename")));
        tv2.setText(String.valueOf(bundle.getString("phoneprice")));

        String [] values =
                {"1","2","3","4","5"};
        Spinner spinner =v.findViewById(R.id.spinner);
        ArrayAdapter<String> LTRadapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        LTRadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(LTRadapter);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment fragment = new thankyou();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frameLayout,fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return  v;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Billing Page");
    }
}
