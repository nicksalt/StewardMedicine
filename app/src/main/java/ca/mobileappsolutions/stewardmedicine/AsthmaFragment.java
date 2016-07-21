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

/**
 * Created by Nick on 2016-07-20.
 */

public class AsthmaFragment extends Fragment {

    public AsthmaFragment() {
    }

    WebView displayYoutubeVideo1;
    WebView displayYoutubeVideo2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.asthma, container, false);
        setLinks(rootView);
        setButtons(rootView);
        setVideos(rootView);
        return rootView;

    }

    public void setLinks(View view){
        SpannableStringBuilder spanTxt = new SpannableStringBuilder(
                "The video above shows an excellent summary of asthma. In short, asthma is caused by INFLAMMATION of a person’s airways. This inflammation can be caused by a number of different ");
        spanTxt.append("triggers");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/about/triggers.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "triggers".length(), spanTxt.length(), 0);
        spanTxt.append(".");
        TextView link1 = (TextView) view.findViewById(R.id.asthma_link_1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt2 = new SpannableStringBuilder("• Avoid your ");
        spanTxt2.append("triggers");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/about/triggers.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "triggers".length(), spanTxt2.length(), 0);
        spanTxt2.append(". (This especially includes smoking, you smoke or live with people who smoke!)");
        TextView link2 = (TextView) view.findViewById(R.id.asthma_link_2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link2.setText(spanTxt2, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt3 = new SpannableStringBuilder("There are many different types of puffers these days. " +
                "Some puffers have the medication in aerosol form. Others are in a dry-powder form. Click ");
        spanTxt3.append("HERE");
        spanTxt3.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/treatment/howToUse.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt3.length() - "HERE".length(), spanTxt3.length(), 0);
        spanTxt3.append(" for more information.");
        TextView link3 = (TextView) view.findViewById(R.id.asthma_link_3);
        link3.setMovementMethod(LinkMovementMethod.getInstance());
        link3.setText(spanTxt3, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt4 = new SpannableStringBuilder("One of the most common type of puffer is an aerosol ");
        spanTxt4.append("“Metered-Dose Inhaler“");
        spanTxt4.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/treatment/meteredDoseInhaler.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt4.length() - "“Metered-Dose Inhaler“".length(), spanTxt4.length(), 0);
        spanTxt4.append(". Click ");
        spanTxt4.append("HERE FOR A VIDEO");
        spanTxt4.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Rdb3p9RZoR4");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt4.length() - "HERE FOR A VIDEO".length(), spanTxt4.length(), 0);
        spanTxt4.append(" on how to use these multi-dose inhalers.");
        TextView link4 = (TextView) view.findViewById(R.id.asthma_link_4);
        link4.setMovementMethod(LinkMovementMethod.getInstance());
        link4.setText(spanTxt4, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt5 = new SpannableStringBuilder("Multi-dose inhalers are ideally used with a ");
        spanTxt5.append("“spacer”");
        spanTxt5.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/treatment/spacers.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt5.length() - "“spacer”".length(), spanTxt5.length(), 0);
        spanTxt5.append(" or ");
        spanTxt5.append("“aerochamber“");
        spanTxt5.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/treatment/spacers.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt5.length() - "“aerochamber”".length(), spanTxt5.length(), 0);
        spanTxt5.append(", especially for children! Click ");
        spanTxt5.append("HERE FOR A VIDEO");
        spanTxt5.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://youtu.be/hCAsW7OM9Ns");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt5.length() - "HERE FOR A VIDEO".length(), spanTxt5.length(), 0);
        spanTxt5.append("  on how to use these spacers.");
        TextView link5 = (TextView) view.findViewById(R.id.asthma_link_5);
        link5.setMovementMethod(LinkMovementMethod.getInstance());
        link5.setText(spanTxt5, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt6 = new SpannableStringBuilder("Some puffers come in the form of a ");
        spanTxt6.append("“Diskus“");
        spanTxt6.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/treatment/diskus.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt6.length() - "“Diskus“".length(), spanTxt6.length(), 0);
        spanTxt6.append(". Click ");
        spanTxt6.append("HERE FOR A VIDEO");
        spanTxt6.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://youtu.be/Kr02is6jVUk");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt6.length() - "HERE FOR A VIDEO".length(), spanTxt6.length(), 0);
        spanTxt6.append(" on how to use these diskus inhalers.");
        TextView link6 = (TextView) view.findViewById(R.id.asthma_link_6);
        link6.setMovementMethod(LinkMovementMethod.getInstance());
        link6.setText(spanTxt6, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt7 = new SpannableStringBuilder("Some puffers come in the form of a ");
        spanTxt7.append("“Turbuhaler“");
        spanTxt7.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/treatment/turbuhaler.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt7.length() - "“Turbuhaler“".length(), spanTxt7.length(), 0);
        spanTxt7.append(". Click ");
        spanTxt7.append("HERE FOR A VIDEO");
        spanTxt7.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://youtu.be/J9Rv9_ix3Fg");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt7.length() - "HERE FOR A VIDEO".length(), spanTxt7.length(), 0);
        spanTxt7.append(" on how to use these turbuhalers.");
        TextView link7 = (TextView) view.findViewById(R.id.asthma_link_7);
        link7.setMovementMethod(LinkMovementMethod.getInstance());
        link7.setText(spanTxt7, TextView.BufferType.SPANNABLE);
    }

    public void setButtons(View view){
        TextView button1 = (TextView) view.findViewById(R.id.asthma_button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/about/whatIsAsthma.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });

        TextView button2 = (TextView) view.findViewById(R.id.asthma_button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/treatment/relievers.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });

        TextView button3 = (TextView) view.findViewById(R.id.asthma_button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.asthma.ca/adults/treatment/steroids.php");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });

        TextView button4 = (TextView) view.findViewById(R.id.asthma_button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.asthma.ca/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });

        TextView button5 = (TextView) view.findViewById(R.id.asthma_button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.respiratoryguidelines.ca/guideline/asthma");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
    }

    public void setVideos(View view){
        DisplayMetrics dm = getResources().getDisplayMetrics();
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2)*56;
        double y = (x*.75);
        displayYoutubeVideo1 = (WebView) view.findViewById(R.id.asthma_vid_1);
        String frameV = getResources().getString(R.string.asthma_vid_1);
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

        displayYoutubeVideo2 = (WebView) view.findViewById(R.id.asthma_vid_2);
        String frameV2 = getResources().getString(R.string.asthma_vid_2);
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
}
