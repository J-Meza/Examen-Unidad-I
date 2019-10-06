package com.example.exa1_tabulador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
FragmentRead1 frR1;
FragmentRead2 frR2;
FragmentRead3 frR3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frR1 = new FragmentRead1();
        frR2= new FragmentRead2();
        frR3=new FragmentRead3();

        getSupportFragmentManager().beginTransaction().add(R.id.frmLyt,frR1).commit();

    }
    public void Btnclick(View v) {
        FragmentTransaction frTrans = getSupportFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.btn1:
                frTrans.replace(R.id.frmLyt, frR1);
                break;
            case R.id.btn2:
                frTrans.replace(R.id.frmLyt, frR2);
                break;
            case R.id.btn3:
                frTrans.replace(R.id.frmLyt, frR3);
                break;
        }
        frTrans.commit();

    }

}
