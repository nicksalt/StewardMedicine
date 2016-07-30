package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.app.FragmentManager;
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
 * Created by Nick on 2016-07-29.
 */

public class PainFragment extends Fragment {
    public PainFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pain, container, false);
        setLinks(rootView);
        return rootView;
    }
    public void setLinks(View view){
        TextView button1 = (TextView) view.findViewById(R.id.pain_button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=547");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button2 = (TextView) view.findViewById(R.id.pain_button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/?page_id=564");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
    }

}
