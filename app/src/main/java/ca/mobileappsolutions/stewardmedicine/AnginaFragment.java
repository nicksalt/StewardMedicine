package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

import java.net.URL;

/**
 * Created by Nick on 2016-07-11.
 */

public class AnginaFragment extends Fragment {
    public AnginaFragment() {

    }

    WebView displayYoutubeVideo1;
    WebView displayYoutubeVideo2;
    WebView displayYoutubeVideo3;
    WebView displayYoutubeVideo4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.heart_attacks_angina, container, false);
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        DisplayMetrics dm = getResources().getDisplayMetrics();
        getVideos(rootView, dm);
        int screenWidth = dm.widthPixels;
        int x = (int) (screenWidth*.96);
        int y = (int)(x/2.3717472119);
        Drawable drawable = getResources().getDrawable(R.drawable.heart_and_stroke);
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Drawable drawable1 = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, x, y, true));
        ImageButton heartAndStroke = (ImageButton) rootView.findViewById(R.id.heart_and_stroke);
        heartAndStroke.setImageDrawable(drawable1);
        heartAndStroke.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToUrl("http://www.heartandstroke.com/site/c.ikIQLcMWJtE/b.3483917/k.DAA8/Heart_disease__Signs_of_heart_attack_cardiac_arrest_and_sudden_arrhythmia_death_syndrome_SADS.htm#heartattack");
            }
        });
        int x2 = (int) (screenWidth*.5);
        int y2 = (int)(x2/2.3717472119);
        Drawable drawable2 = getResources().getDrawable(R.drawable.heart_and_stroke_logo);
        Bitmap bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
        Drawable drawable3 = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap2, x2, y2, true));
        ImageButton heartAndStrokeLogo = (ImageButton) rootView.findViewById(R.id.heart_and_stroke_logo);
        heartAndStrokeLogo.setImageDrawable(drawable3);
        heartAndStrokeLogo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToUrl("http://www.heartandstroke.com/site/c.ikIQLcMWJtE/b.3484021/k.7C85/Heart_Disease.htm");
            }
        });
        Button button = (Button) rootView.findViewById(R.id.heart_angina_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToUrl("http://www.heartandstroke.com/site/c.ikIQLcMWJtE/b.3484021/k.7C85/Heart_Disease.htm");
            }
        });
        return rootView;

    }
    public void goToUrl(String url){
        Uri uri = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchBrowser);
    }

    public void getVideos(View rootView, DisplayMetrics dm){
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2)*56;
        double y = (x*.75);

        displayYoutubeVideo1 = (WebView) rootView.findViewById(R.id.webview2);
        String frameV1 = getResources().getString(R.string.heart_attack_video);
        String frameVideo1 = String.format(frameV1, x, y);
        displayYoutubeVideo1.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings1 = displayYoutubeVideo1.getSettings();
        webSettings1.setJavaScriptEnabled(true);
        displayYoutubeVideo1.loadData(frameVideo1, "text/html", "null");

        displayYoutubeVideo2 = (WebView) rootView.findViewById(R.id.webview3);
        String frameV2 = getResources().getString(R.string.angina_video);
        String frameVideo2 = String.format(frameV2, x, y);
        displayYoutubeVideo2.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings2 = displayYoutubeVideo2.getSettings();
        webSettings2.setJavaScriptEnabled(true);
        displayYoutubeVideo2.loadData(frameVideo2, "text/html", "null");

        displayYoutubeVideo3 = (WebView) rootView.findViewById(R.id.webview4);
        String frameV3 = getResources().getString(R.string.heart_attack_symptoms_video);
        String frameVideo3 = String.format(frameV3, x, y);
        displayYoutubeVideo3.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings3 = displayYoutubeVideo3.getSettings();
        webSettings3.setJavaScriptEnabled(true);
        displayYoutubeVideo3.loadData(frameVideo3, "text/html", "null");

        displayYoutubeVideo4 = (WebView) rootView.findViewById(R.id.webview5);
        String frameV4 = getResources().getString(R.string.angina_and_chest_pains_video);
        String frameVideo4 = String.format(frameV4, x, y);
        displayYoutubeVideo4.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings4 = displayYoutubeVideo4.getSettings();
        webSettings4.setJavaScriptEnabled(true);
        displayYoutubeVideo4.loadData(frameVideo4, "text/html", "null");
    }

    @Override
    public void onPause(){
        super.onPause();
        displayYoutubeVideo1.onPause();
        displayYoutubeVideo2.onPause();
        displayYoutubeVideo3.onPause();
        displayYoutubeVideo4.onPause();

    }
}
