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
 * Created by Nick on 2016-07-25.
 */

public class ConcussionFragment extends Fragment {
    public ConcussionFragment(){}
    WebView displayYoutubeVideo1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.concussions, container, false);
        setVideos(rootView);
        setLinks(rootView);
        return rootView;
    }

    public void setVideos(View view){
        DisplayMetrics dm = getResources().getDisplayMetrics();
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2)*56;
        double y = (x*.75);
        displayYoutubeVideo1 = (WebView) view.findViewById(R.id.concussions_vid_1);
        String frameV = getResources().getString(R.string.concussions_vid);
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
    public void setLinks(View view){
        SpannableStringBuilder spanTxt = new SpannableStringBuilder("• You CAN give over-the-counter " +
                "medications like Tylenol ");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=305");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Tylenol ".length(), spanTxt.length(), 0);
        spanTxt.append(" or Advil");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=325");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Advil".length(), spanTxt.length(), 0);
        spanTxt.append(" for a headache (but avoid aspirin!)");
        TextView link1 = (TextView) view.findViewById(R.id.concussions_link_1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt, TextView.BufferType.SPANNABLE);
    }
}
