package com.example.fragmentmanagers;

import android.nfc.Tag;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class BlankFragment1 extends Fragment {
    private static final String TAG ="you";
    private View rootview;


    public BlankFragment1() {
        // Required empty public constructor
    }

    private IFragmentCallback fragmentCallback;
    public void setFragmentCallback(IFragmentCallback callback){
        fragmentCallback = callback;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        String string = bundle.getString("message");
        Log.d(TAG,"onCreate:"+string);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(rootview == null) {
            rootview = inflater.inflate(R.layout.fragment_blank1, container, false);
        }
        Button btn = rootview.findViewById(R.id.btn_3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragmentCallback.sendMsgToActivity("hello,i'm from Fragment");
                //给Activity送过去
                String msg = fragmentCallback.getMsgFromActivity("null");
                Toast.makeText(BlankFragment1.this.getContext(),msg,Toast.LENGTH_SHORT).show();
                //从Activity拿过来
            }
        });
        return rootview;
    }
}