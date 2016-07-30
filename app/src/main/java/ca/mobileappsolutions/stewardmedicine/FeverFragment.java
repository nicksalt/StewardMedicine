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

public class FeverFragment extends Fragment {
    public FeverFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fever, container, false);
        setLinks(rootView);
        return rootView;
    }
    public void setLinks(View view){
            SpannableStringBuilder spanTxt = new SpannableStringBuilder("Here is a Guide to Fevers");
            spanTxt.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View widget) {
                    Uri uri = Uri.parse("http://quintepediatrics.com/2015/01/a-guide-to-fevers/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(launchBrowser);
                }
            }, spanTxt.length() - "Tylenol".length(), spanTxt.length(), 0);
            spanTxt.append(" by Quinte Pediatrics and Adolescent Medicine.");
            TextView link1 = (TextView) view.findViewById(R.id.fever_link_1);
            link1.setMovementMethod(LinkMovementMethod.getInstance());
            link1.setText(spanTxt, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt2 = new SpannableStringBuilder("Remember, the doses recommended on the bottles of Tylenol (acetaminophen)");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=305");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "Tylenol (acetaminophen)".length(), spanTxt2.length(), 0);
        spanTxt2.append(") and Advil or Motrin (ibuprofen)");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/advil-dosing");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "Advil or Motrin (ibuprofen)".length(), spanTxt2.length(), 0);
        spanTxt2.append(" are usually less than your child can actually take. Click on the links for each of the medicines to find out the proper dose of each for your child.");
        TextView link2 = (TextView) view.findViewById(R.id.fever_link_2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link2.setText(spanTxt2, TextView.BufferType.SPANNABLE);
    }

}
