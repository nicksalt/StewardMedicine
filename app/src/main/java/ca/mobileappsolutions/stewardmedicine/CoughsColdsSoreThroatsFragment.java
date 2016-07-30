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
 * Created by Nick on 2016-07-28.
 */

public class CoughsColdsSoreThroatsFragment extends Fragment {

    public CoughsColdsSoreThroatsFragment(){}

    WebView displayYoutubeVideo1;
    WebView displayYoutubeVideo2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.coughs_colds_and_sore_throats, container, false);
        setVideos(rootView);
        setLinks(rootView);
        return rootView;
    }
    public void setVideos(View view){
        DisplayMetrics dm = getResources().getDisplayMetrics();
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2)*56;
        double y = (x*.75);
        displayYoutubeVideo1 = (WebView) view.findViewById(R.id.coughs_colds_and_sore_throats_vid_1);
        String frameV = getResources().getString(R.string.coughs_colds_and_sore_throats_vid_1);
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

        displayYoutubeVideo2 = (WebView) view.findViewById(R.id.coughs_colds_and_sore_throats_vid_2);
        String frameV2 = getResources().getString(R.string.coughs_colds_and_sore_throats_vid_2);
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
        SpannableStringBuilder spanTxt = new SpannableStringBuilder("• Acetaminophen (Tylenol)");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/%20");               Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Acetaminophen (Tylenol)".length(), spanTxt.length(), 0);
        spanTxt.append(" and Ibuprofen (Advil or Motrin)");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=325");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Ibuprofen (Advil or Motrin)".length(), spanTxt.length(), 0);
        spanTxt.append(" can be taken for fever, chills, discomfort, pain, and muscle aches.");
        TextView link1 = (TextView) view.findViewById(R.id.coughs_colds_and_sore_throats_link_1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt, TextView.BufferType.SPANNABLE);
    }

    @Override
    public void onPause(){
        super.onPause();
        displayYoutubeVideo1.onPause();
        displayYoutubeVideo2.onPause();
    }

}
