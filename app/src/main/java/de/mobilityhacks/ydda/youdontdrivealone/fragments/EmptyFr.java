package de.mobilityhacks.ydda.youdontdrivealone.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.mobilityhacks.ydda.youdontdrivealone.R;

/**
 *
 */

public class EmptyFr extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.empty_layout, container, false);
    }
}
