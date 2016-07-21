package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Nick on 2016-07-14.
 */

public class AnnualPhysicals extends Fragment {

    public AnnualPhysicals(){}
    WebView displayYoutubeVideo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.annual_physicals, container, false);
        setVideo(rootView);
        setDualLinkText((TextView) rootView.findViewById(R.id.annual_physical_dual_link));
        Button button = (Button) rootView.findViewById(R.id.annual_physical_button_1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.stewartmedicine.com/wp-content/uploads/2015/03/AHE-not-reqd-2.pdf")));

            }
        });
        return rootView;
    }

    public void setVideo(View rootView){
        DisplayMetrics dm = getResources().getDisplayMetrics();
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2)*56;
        double y = (x*.75);
        displayYoutubeVideo = (WebView) rootView.findViewById(R.id.annual_physical_vid);
        String frameV = getResources().getString(R.string.annual_physical_video);
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
    }

    public void setDualLinkText(TextView view){
        SpannableStringBuilder spanTxt = new SpannableStringBuilder(
                "** For a little more information on this topic, check out ");
        spanTxt.append("Choosing Wisely website");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.choosingwiselycanada.org/materials/health-checkups-when-you-need-them-and-when-you-dont/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Choosing Wisely website".length(), spanTxt.length(), 0);
        spanTxt.append(" or here is a ");
        spanTxt.setSpan(new ForegroundColorSpan(Color.BLACK), 32, spanTxt.length(), 0);
        spanTxt.append("PDF Summary");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.stewartmedicine.com/wp-content/uploads/2015/06/Health-check-ups-EN-web.pdf")));
            }
        }, spanTxt.length() - "PDF Summary".length(), spanTxt.length(), 0);
        spanTxt.append(" of the same. **");
        view.setMovementMethod(LinkMovementMethod.getInstance());
        view.setText(spanTxt, TextView.BufferType.SPANNABLE);

    }
    @Override
    public void onPause(){
        super.onPause();
        displayYoutubeVideo.onPause();
    }
}
