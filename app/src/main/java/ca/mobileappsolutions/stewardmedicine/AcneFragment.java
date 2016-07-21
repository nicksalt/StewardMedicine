package ca.mobileappsolutions.stewardmedicine;




import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;


public class AcneFragment extends Fragment {

    public AcneFragment() {
    }

    WebView displayYoutubeVideo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.activity_acne_fragment, container, false);
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        DisplayMetrics dm = getResources().getDisplayMetrics();
        displayYoutubeVideo = (WebView) rootView.findViewById(R.id.webview1);
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2)*56;
        double y = (x*.75);
        Log.d("X&Y", Double.toString(x)+" "+Double.toString(y));
        String frameV = getResources().getString(R.string.acne_video);
        String frameVideo = String.format(frameV, x, y);

        displayYoutubeVideo.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = displayYoutubeVideo.getSettings();
        webSettings.setJavaScriptEnabled(true);

        displayYoutubeVideo.loadData(frameVideo, "text/html", "null");


        return rootView;
    }


    @Override
    public void onPause(){
        super.onPause();
        displayYoutubeVideo.onPause();
    }
}

