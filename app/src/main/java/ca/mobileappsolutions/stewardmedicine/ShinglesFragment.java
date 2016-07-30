package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Nick on 2016-07-29.
 */

public class ShinglesFragment extends Fragment {
    public ShinglesFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.shingles, container, false);
        WebView webview = (WebView) rootView.findViewById(R.id.shingles_pdf);
        webview.getSettings().setJavaScriptEnabled(true);
        String pdf = "http://www.stewartmedicine.com/wp-content/uploads/2015/03/Shingles-vaccine.pdf";
        webview.loadUrl("https://docs.google.com/viewer?url=" + pdf);
        return rootView;
    }
}
