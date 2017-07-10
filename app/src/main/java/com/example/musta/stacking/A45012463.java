package com.example.musta.stacking;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class A45012463 extends DialogFragment {
    private ListView listView1;
    private ListView listView2;
    private Button cancelButton1;
    private Button cancelButton2;
    private String[] companyName;
    private String[] actionName;
    private ArrayAdapter<String> adapter;

    public A45012463(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView  = inflater.inflate(R.layout.activity_a45012463, container);
        getDialog().setTitle("Contact");
        return rootView;

    }
}
