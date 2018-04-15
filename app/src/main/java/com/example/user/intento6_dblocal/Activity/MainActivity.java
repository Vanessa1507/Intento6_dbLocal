package com.example.user.intento6_dblocal.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.intento6_dblocal.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DepartamentosClass> departamentosList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
