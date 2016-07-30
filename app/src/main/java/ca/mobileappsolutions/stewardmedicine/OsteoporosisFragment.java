package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nick on 2016-07-28.
 */

public class OsteoporosisFragment extends Fragment {
    public OsteoporosisFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.osteoporosis, container, false);
        setLinks(rootView);
        return rootView;
    }
    public void setLinks(View view){
        SpannableStringBuilder spanTxt = new SpannableStringBuilder("For more information, be sure to visit OSTEOPOROSIS CANADA’s website.");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.osteoporosis.ca/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "OSTEOPOROSIS CANADA’s website.".length(), spanTxt.length(), 0);
        TextView link1 = (TextView) view.findViewById(R.id.osteoporosis_link_1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt2 = new SpannableStringBuilder("• If you are over 50, make sure you are taking VITAMIN D");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.osteoporosis.ca/osteoporosis-and-you/nutrition/vitamin-d");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "VITAMIN D".length(), spanTxt2.length(), 0);
        spanTxt2.append(". It is a simple over-the-counter vitamin. Aim for 1000-2000 units per day. Note: many multi-vitamins do not contain enough vitamin D. Check the dose on the side of your bottles!");
        TextView link2 = (TextView) view.findViewById(R.id.osteoporosis_button_1);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link2.setText(spanTxt2, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt3 = new SpannableStringBuilder("• If you are over 50, make sure you are getting enough CALCIUM");
        spanTxt3.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.osteoporosis.ca/osteoporosis-and-you/nutrition/calcium-requirements/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt3.length() - "CALCIUM".length(), spanTxt3.length(), 0);
        spanTxt3.append(" in your diet. CLICK HERE TO CALCULATE");
        spanTxt3.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.osteoporosis.ca/osteoporosis-and-you/nutrition/calculate-my-calcium/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt3.length() - "CLICK HERE TO CALCULATE".length(), spanTxt3.length(), 0);
        spanTxt3.append("  how much calcium you are getting in your daily diet. Most people should aim for at total of 1000mg per day. If you do not get enough in your diet, you may need to supplement with over-the-counter tablets.");
        TextView link3 = (TextView) view.findViewById(R.id.osteoporosis_button_2);
        link3.setMovementMethod(LinkMovementMethod.getInstance());
        link3.setText(spanTxt3, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt4 = new SpannableStringBuilder("• Get regular EXERCISE");
        spanTxt4.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.osteoporosis.ca/osteoporosis-and-you/exercise-for-healthy-bones/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt4.length() - "EXERCISE".length(), spanTxt4.length(), 0);
        spanTxt4.append(".");
        TextView link4 = (TextView) view.findViewById(R.id.osteoporosis_button_3);
        link4.setMovementMethod(LinkMovementMethod.getInstance());
        link4.setText(spanTxt4, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt5 = new SpannableStringBuilder("• Quit SMOKING");
        spanTxt5.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=353");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt5.length() - "SMOKING".length(), spanTxt5.length(), 0);
        spanTxt5.append(". Smoking is a huge risk for causing brittle bones.");
        TextView link5 = (TextView) view.findViewById(R.id.osteoporosis_button_4);
        link5.setMovementMethod(LinkMovementMethod.getInstance());
        link5.setText(spanTxt5, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt6 = new SpannableStringBuilder("Everyone over the age of 65 should have a Bone Mineral Density test");
        spanTxt6.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.osteoporosis.ca/osteoporosis-and-you/nutrition/calcium-requirements/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt6.length() - "Bone Mineral Density test".length(), spanTxt6.length(), 0);
        spanTxt6.append(". It is also recommended for some people younger than 65 who have certain risk factors");
        spanTxt6.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("https://www.osteoporosis.ca/osteoporosis-and-you/diagnosis/risk-factors/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt6.length() - "risk factors".length(), spanTxt6.length(), 0);
        spanTxt6.append(".");
        TextView link6 = (TextView) view.findViewById(R.id.osteoporosis_button_5);
        link6.setMovementMethod(LinkMovementMethod.getInstance());
        link6.setText(spanTxt6, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt7 = new SpannableStringBuilder("If you already have osteoporosis, it is important to prevent your bones from becoming weaker, as suggested above. However, you will also benefit from taking a prescription medication to help keep your bones strong.  The most common is a pill that you take only once per WEEK. This type of medication is called a “bisphosphonate“. Click here for more information on bisphosphonate medications");
        spanTxt7.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.osteoporosis.ca/osteoporosis-and-you/drug-treatments/bisphosphonates/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt7.length() - "Click here for more information on bisphosphonate medications".length(), spanTxt7.length(), 0);
        spanTxt7.append(". Speak to your doctor for more information.");
        TextView link7 = (TextView) view.findViewById(R.id.osteoporosis_button_6);
        link7.setMovementMethod(LinkMovementMethod.getInstance());
        link7.setText(spanTxt7, TextView.BufferType.SPANNABLE);
    }
}
