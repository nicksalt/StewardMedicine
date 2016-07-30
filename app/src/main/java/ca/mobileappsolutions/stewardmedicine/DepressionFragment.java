package ca.mobileappsolutions.stewardmedicine;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nick on 2016-07-28.
 */

public class DepressionFragment extends Fragment {
    public DepressionFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.depression, container, false);
        setButtons(rootView);
        return rootView;
    }

    public void setButtons(View view){
        TextView button1 = (TextView) view.findViewById(R.id.depression_button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/depression-mental-health/mental-health-counselling");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button2 = (TextView) view.findViewById(R.id.depression_button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/depression-mental-health/relaxation-stress-tips");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button3 = (TextView) view.findViewById(R.id.depression_button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/depression-mental-health/financial-strain-or-legal-help");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button4 = (TextView) view.findViewById(R.id.depression_button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/depression-mental-health/lifestyle-changes-for-mental-health");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button5 = (TextView) view.findViewById(R.id.depression_button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/depression-mental-health/substance-use-addictions-help");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button6 = (TextView) view.findViewById(R.id.depression_button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/depression-mental-health/medications-for-mood");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button7 = (TextView) view.findViewById(R.id.depression_button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/depression-mental-health/brief-cbt-techniques");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
    }
}
