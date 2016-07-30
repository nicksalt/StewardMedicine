package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nick on 2016-07-29.
 */

public class PinkEyeFragment extends Fragment {
    public PinkEyeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pink_eye, container, false);
        return rootView;
    }
}