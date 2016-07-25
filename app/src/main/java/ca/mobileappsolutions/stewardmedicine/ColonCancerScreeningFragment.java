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
 * Created by Nick on 2016-07-24.
 */

public class ColonCancerScreeningFragment extends Fragment {
    public ColonCancerScreeningFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.colon_cancer_screening, container, false);
        setLinks(rootView);
        return rootView;
    }

    public void setLinks(View view){
        SpannableStringBuilder spanTxt = new SpannableStringBuilder("This short video");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://youtu.be/LfXHoSVXetQ");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "This short video".length(), spanTxt.length(), 0);
        spanTxt.append(" may help to explain things, and explore ");
        spanTxt.append("this website");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.health.gov.on.ca/en/public/programs/coloncancercheck/colorectal_cancer.aspx");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "this website".length(), spanTxt.length(), 0);
        spanTxt.append(" to learn more.");
        TextView link1 = (TextView) view.findViewById(R.id.colon_cancer_screening_link_1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt2 = new SpannableStringBuilder("This short video");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://youtu.be/SzJe_D0-J38");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "This short video".length(), spanTxt2.length(), 0);
        spanTxt2.append("  explains the FOBT a bit more. You can also check out the links ");
        spanTxt2.append("HERE");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.health.gov.on.ca/en/public/programs/coloncancercheck/fobt.aspx");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "HERE".length(), spanTxt2.length(), 0);
        spanTxt2.append(" and ");
        spanTxt2.append("HERE");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.health.gov.on.ca/en/public/programs/coloncancercheck/docs/fobt/English_FOBT_instructions.pdf");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "HERE".length(), spanTxt2.length(), 0);
        spanTxt2.append(" for more information.");
        TextView link2 = (TextView) view.findViewById(R.id.colon_cancer_screening_link_2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link2.setText(spanTxt2, TextView.BufferType.SPANNABLE);
    }

}
