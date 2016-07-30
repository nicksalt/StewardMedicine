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

public class DiarrheaFragment extends Fragment {
    public DiarrheaFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.diarrhea, container, false);
        setLinks(rootView);
        return rootView;
    }
    public void setLinks(View view){
        SpannableStringBuilder spanTxt = new SpannableStringBuilder("• For nausea or vomitting, take over-the-counter Gravol");
        spanTxt.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=338");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt.length() - "Gravol".length(), spanTxt.length(), 0);
        spanTxt.append(".");
        TextView link1 = (TextView) view.findViewById(R.id.diarrhea_link_1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link1.setText(spanTxt, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt2 = new SpannableStringBuilder("• For belly cramps, you can take anti-inflammatories (i.e. Advil");
        spanTxt2.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=325");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt2.length() - "Advil".length(), spanTxt2.length(), 0);
        spanTxt2.append(", Motrin, Aleve, Ibuprofen, Naproxen), as long as your doctor has not told you to avoid them for other reasons.");
        TextView link2 = (TextView) view.findViewById(R.id.diarrhea_link_2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link2.setText(spanTxt2, TextView.BufferType.SPANNABLE);

        SpannableStringBuilder spanTxt3 = new SpannableStringBuilder("• You can also take Tylenol (a.k.a. acetaminophen)");
        spanTxt3.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=305");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        }, spanTxt3.length() - "Tylenol (a.k.a. acetaminophen)".length(), spanTxt3.length(), 0);
        spanTxt3.append(" for pain, fever and muscle aches.");
        TextView link3 = (TextView) view.findViewById(R.id.diarrhea_link_3);
        link3.setMovementMethod(LinkMovementMethod.getInstance());
        link3.setText(spanTxt3, TextView.BufferType.SPANNABLE);
    }
}
