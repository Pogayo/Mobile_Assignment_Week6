package com.pogayo.studentrecords;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class EntryFragment extends Fragment {

    AddClicked mCallback;
    Button mButton;

    public interface AddClicked{
         void sendText(String text);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_entry,
                container, false);

        mButton = view.findViewById(R.id.s_add_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                addRecord();
            }
        });
        return view;


    }

    public void addRecord(){
        mCallback.sendText("Hello World");
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AddClicked) {
            mCallback = (AddClicked) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnGreenFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallback = null;
    }
}
