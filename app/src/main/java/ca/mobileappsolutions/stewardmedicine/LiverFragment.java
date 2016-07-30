package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

/**
 * Created by Nick on 2016-07-28.
 */

public class LiverFragment extends Fragment {
    public LiverFragment() {
    }

    WebView displayYoutubeVideo1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.liver, container, false);
        setVideos(rootView);
        setButtons(rootView);
        return rootView;
    }

    public void setVideos(View view) {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2) * 56;
        double y = (x * .75);
        displayYoutubeVideo1 = (WebView) view.findViewById(R.id.liver_vid_1);
        String frameV = getResources().getString(R.string.liver_vid_1);
        String frameVideo = String.format(frameV, x, y);
        displayYoutubeVideo1.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = displayYoutubeVideo1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        displayYoutubeVideo1.loadData(frameVideo, "text/html", "null");

    }

    public void setButtons(View view) {
        TextView button1 = (TextView) view.findViewById(R.id.liver_button_one);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.liver.ca/liver-disease/types/fatty-liver.aspx#1");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
    }
    @Override
    public void onPause() {
        super.onPause();
        displayYoutubeVideo1.onPause();
    }
}
