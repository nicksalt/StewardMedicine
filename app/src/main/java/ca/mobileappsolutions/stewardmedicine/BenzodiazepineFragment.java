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
 * Created by Nick on 2016-07-21.
 */

public class BenzodiazepineFragment extends Fragment {

    public BenzodiazepineFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.benzodiazepine, container, false);
        setLinks(rootView);
        setButtons(rootView);
        return rootView;
    }

    public void setLinks(View view){
        SpannableStringBuilder spanTxt = new SpannableStringBuilder(
                "As you get older, the risks and side effects of all of these medications increase. Here is  more ");
        spanTxt.append("information for OLDER PATIENTS.");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/wp-content/uploads/2015/03/Sleep-meds-elderly.pdf");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "information for OLDER PATIENTS.".length(), spanTxt.length(), 0);
        spanTxt.append(".");
        TextView link1 = (TextView) view.findViewById(R.id.benzodiazepine_link_1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt, TextView.BufferType.SPANNABLE);

       /* SpannableStringBuilder spanTxt2 = new SpannableStringBuilder(
                "There are always better options than these medications. For trouble sleeping, check out ");
        spanTxt2.append("Dr. Stewart’s advice for sleep and insomnia.");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent sleep = new Intent(BenzodiazepineFragment.this, SleepFragment.class);
                BenzodiazepineFragment.this.startActivity(sleep);
            }
        }, spanTxt2.length() - "Dr. Stewart’s advice for sleep and insomnia.".length(), spanTxt2.length(), 0);
        spanTxt2.append(".");
        TextView link2 = (TextView) view.findViewById(R.id.benzodiazepine_link_2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link2.setText(spanTxt2, TextView.BufferType.SPANNABLE);*/
    }
    public void setButtons(View view){
        TextView button1 = (TextView) view.findViewById(R.id.benzodiazepine_button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/benzodiazepine-medications/benzodiazepines-even-more-information");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button2 = (TextView) view.findViewById(R.id.benzodiazepine_button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.bmj.com/content/349/bmj.g5205");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button3 = (TextView) view.findViewById(R.id.benzodiazepine_button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.bmj.com/content/349/bmj.g5312");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });

    }

}
