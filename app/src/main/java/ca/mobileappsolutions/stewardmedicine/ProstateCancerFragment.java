package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

/**
 * Created by Nick on 2016-07-29.
 */

public class ProstateCancerFragment extends Fragment {
    public ProstateCancerFragment(){}
    WebView displayYoutubeVideo1;
    WebView displayYoutubeVideo2;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.prostate_cancer, container, false);
        setLinks(rootView);
        setVideos(rootView);
        return rootView;
    }
    public void setVideos(View view){
        DisplayMetrics dm = getResources().getDisplayMetrics();
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2) * 56;
        double y = (x * .75);
        displayYoutubeVideo1 = (WebView) view.findViewById(R.id.prostate_cancer_vid_1);
        String frameV = getResources().getString(R.string.prostate_cancer_vid_1);
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

        displayYoutubeVideo2 = (WebView) view.findViewById(R.id.prostate_cancer_vid_2);
        String frameV2 = getResources().getString(R.string.prostate_cancer_vid_2);
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
    }
    public void setLinks(View view){
        SpannableStringBuilder spanTxt1 = new SpannableStringBuilder("HERE is a picture");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/wp-content/uploads/2015/03/PSA-harm-benefit.pdf");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "HERE is a picture".length(), spanTxt1.length(), 0);
        spanTxt1.append(" that shows the risks versus benefits of PSA testing.");
        TextView link1 = (TextView) view.findViewById(R.id.prostate_cancer_link_1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt1, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt2 = new SpannableStringBuilder("CLICK HERE");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://canadiantaskforce.ca/news/2014-10-27/canadian-task-force-recommends-against-screening-for-prostate-cancer/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "HERE".length(), spanTxt2.length(), 0);
        spanTxt2.append(", HERE");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://canadiantaskforce.ca/ctfphc-guidelines/2014-prostate-cancer/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "HERE".length(), spanTxt2.length(), 0);
        spanTxt2.append(", and HERE");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://canadiantaskforce.ca/ctfphc-guidelines/2014-prostate-cancer/patient-faq/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "HERE".length(), spanTxt2.length(), 0);
        spanTxt2.append(" for more information on prostate cancer and prostate screening.");
        TextView link2 = (TextView) view.findViewById(R.id.prostate_cancer_link_2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link2.setText(spanTxt2, TextView.BufferType.SPANNABLE);
    }

    @Override
    public void onPause(){
        super.onPause();
        displayYoutubeVideo1.onPause();
        displayYoutubeVideo2.onPause();
    }
}
