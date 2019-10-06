package com.example.exa1_control_de_rotacion2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
FragmentManager fmManager;
FragmentTransaction fmTrans;
FragmentDetail fmDet;
FragmentImage fmIm;
FragmentTitle fmTit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fmManager = getSupportFragmentManager();

    }
    /*public void Imagen (View v){
        fmTrans = fmManager.beginTransaction();
        fmIm = new FragmentImage();
        fmTrans.addToBackStack(null);
        fmTrans.add(R.id.frmLyt,fmIm,"BLANK_FRAGMMENT");
        fmTrans.commit();
    }*/
}
