package com.morrisproductions.jamie.lacrossecoach;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jamie on 25/04/2015.
 */
public class HomeFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
            View rootView = inflater.inflate(R.layout.fragment_home, container, false);
            return rootView;
    }
}
