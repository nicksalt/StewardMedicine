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
 * Created by Nick on 2016-07-24.
 */

public class BackPainFragment extends Fragment{

    public BackPainFragment(){}
    WebView displayYoutubeVideo1;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.back_pain, container, false);
        setVideos(rootView);
        setLinks(rootView);
        setButtons(rootView);
        return rootView;
    }

    public void setVideos (View view){
        DisplayMetrics dm = getResources().getDisplayMetrics();
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2)*56;
        double y = (x*.75);
        displayYoutubeVideo1 = (WebView) view.findViewById(R.id.back_pain_vid_1);
        String frameV = getResources().getString(R.string.back_pain_vid_1);
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
    public void setLinks (View view){

        SpannableStringBuilder spanTxt1 = new SpannableStringBuilder(
                "•");
        spanTxt1.append("1");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=ZcTbcIM0u-8");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "1".length(), spanTxt1.length(), 0);
        spanTxt1.append(", ");
        spanTxt1.append("2");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=wH-6HEMMkQ4");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "2".length(), spanTxt1.length(), 0);
        spanTxt1.append(", ");
        spanTxt1.append("3");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=m0nEJhh5sI4");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "3".length(), spanTxt1.length(), 0);
        spanTxt1.append(", ");
        spanTxt1.append("4");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=9kDjqHQO5CM");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "4".length(), spanTxt1.length(), 0);
        spanTxt1.append(", ");
        spanTxt1.append("5");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=zNsuRVyoOLM");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "5".length(), spanTxt1.length(), 0);
        spanTxt1.append(", ");
        spanTxt1.append("6");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=WL7wrlyVuZY");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "6".length(), spanTxt1.length(), 0);
        spanTxt1.append(", ");
        spanTxt1.append("7");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=xwDvDPCtg_s");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "7".length(), spanTxt1.length(), 0);
        spanTxt1.append(", ");
        spanTxt1.append("8");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=SHnnlmC5s_k");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "8".length(), spanTxt1.length(), 0);
        spanTxt1.append(", ");
        spanTxt1.append("9");
        spanTxt1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=GF8pVJF5lxE");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt1.length() - "9".length(), spanTxt1.length(), 0);
        spanTxt1.append(". (This video series is intended to teach physicians about back pain, but it is highly educational for patients too.) ");
        TextView link2 = (TextView) view.findViewById(R.id.back_pain_link_1);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link2.setText(spanTxt1, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt = new SpannableStringBuilder(
                "Be sure to also check out the pages on ");
        spanTxt.append("Acute Pain (new pain)");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=547");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Acute Pain (new pain)".length(), spanTxt.length(), 0);
        spanTxt.append(" or ");
        spanTxt.append("Chronic Pain (long term pain)");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=564");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Chronic Pain (long term pain)".length(), spanTxt.length(), 0);
        spanTxt.append(" for more information on treating your pain.");
        TextView link1 = (TextView) view.findViewById(R.id.back_pain_link_2);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt2 = new SpannableStringBuilder(
                "If you know your PATTERN of back pain, here are handouts for advice on each of them: ");
        spanTxt2.append("Pattern 1");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.sasksurgery.ca/pdf/healthy-back-exercises1.pdf");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "Pattern 1".length(), spanTxt2.length(), 0);
        spanTxt2.append(", ");
        spanTxt2.append("Pattern 2");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.sasksurgery.ca/pdf/healthy-back-exercises2.pdf");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "Pattern 2".length(), spanTxt2.length(), 0);
        spanTxt2.append(", ");
        spanTxt2.append("Pattern 3");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.sasksurgery.ca/pdf/healthy-back-exercises3.pdf");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "Pattern 3".length(), spanTxt2.length(), 0);
        spanTxt2.append(", ");
        spanTxt2.append("Pattern 4");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.sasksurgery.ca/pdf/healthy-back-exercises4.pdf");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "Pattern 4".length(), spanTxt2.length(), 0);
        spanTxt2.append(". (Refer to Dr. Hamilton Hall’s video series above to help determine which pattern you are).");
        TextView link3 = (TextView) view.findViewById(R.id.back_pain_link_3);
        link3.setMovementMethod(LinkMovementMethod.getInstance());
        link3.setText(spanTxt2, TextView.BufferType.SPANNABLE);
    }
    public void setButtons (View view){
        TextView button1 = (TextView) view.findViewById(R.id.back_pain_button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://backcarecanada.ca/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });


    }
    @Override
    public void onPause(){
        super.onPause();
        displayYoutubeVideo1.onPause();
    }
}
