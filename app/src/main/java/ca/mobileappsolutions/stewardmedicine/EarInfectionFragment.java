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

public class EarInfectionFragment extends Fragment {
    public EarInfectionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ear_infections, container, false);
        setButton(rootView);
        setLinks(rootView);
        return rootView;
    }

    public void setButton(View view) {
        TextView button1 = (TextView) view.findViewById(R.id.ear_infection_button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://quintepediatrics.com/2015/06/swimmers-ear/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
    }

    public void setLinks(View view){
        SpannableStringBuilder spanTxt = new SpannableStringBuilder("Pain relief is the most important thing. Tylenol");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=305");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Tylenol".length(), spanTxt.length(), 0);
        spanTxt.append(" and Advil");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=325");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Advil".length(), spanTxt.length(), 0);
        spanTxt.append(" will help your child’s pain and/or fever. (Click on the links for each medication for proper doses!)");
        TextView link1 = (TextView) view.findViewById(R.id.ear_infection_link_1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt, TextView.BufferType.SPANNABLE);
    }
}