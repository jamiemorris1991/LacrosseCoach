package com.morrisproductions.jamie.lacrossecoach;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.morrisproductions.jamie.lacrossecoach.DrawingActivity;

/**
 * Created by Jamie on 25/04/2015.
 */
public class PlaybookFragment extends Fragment
{
    public PlaybookFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_playbook, container, false);
        return rootView;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.createPlayBtn:
                Intent drawIntent = new Intent(PlaybookFragment.this.getActivity(), DrawingActivity.class);
                startActivity( drawIntent);
                break;
        }
    }


}
