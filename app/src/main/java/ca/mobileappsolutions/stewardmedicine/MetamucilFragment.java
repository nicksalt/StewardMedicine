package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nick on 2016-07-28.
 */

public class MetamucilFragment extends Fragment {
    public MetamucilFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.metamucil, container, false);
        return rootView;
    }
}