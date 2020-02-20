package com.pogayo.studentrecords;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.View;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        String message=getIntent().getStringExtra("message");
        Log.d("Message2",message);


        Bundle bundle = new Bundle();
        String myMessage = "Stack Overflow is cool!";
        bundle.putString("message", message );
        MessageFragment frag=new MessageFragment();
        frag.setArguments(bundle);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction ft=fragmentManager.beginTransaction();
        ft.add(R.id.message_frame, frag, "MESSAGE_FRAG").addToBackStack(null).commit();
        fragmentManager.executePendingTransactions();

    }


}
