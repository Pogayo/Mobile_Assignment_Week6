package com.pogayo.studentrecords;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements EntryFragment.AddClicked {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void sendText(String text){

        Intent open2= new Intent(getApplicationContext(), MessageActivity.class);
        Log.d("Message",text);
        open2.putExtra("message", text);
        startActivity(open2);
        // Get Fragment B


//      Fragment frag =
//                getSupportFragmentManager().findFragmentByTag("ENTRY");
//        frag.updateText(text);
    }



}
