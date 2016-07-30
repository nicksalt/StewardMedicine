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

public class FinancialStrainFragment extends Fragment {
    public FinancialStrainFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.financial_strain, container, false);
        setButton(rootView);
        return rootView;
    }
    public void setButton(View view){
        TextView button1 = (TextView) view.findViewById(R.id.financial_strain_button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/tips-for-financial-strain");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button2 = (TextView) view.findViewById(R.id.financial_strain_button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.stewartmedicine.com/patient-education/patient-education-2/tips-for-financial-strain");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button3 = (TextView) view.findViewById(R.id.financial_strain_button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://quinte.cioc.ca/record/VIQ3536");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button4 = (TextView) view.findViewById(R.id.financial_strain_button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.hastingscounty.com/services/social-services/social-housing");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button5 = (TextView) view.findViewById(R.id.financial_strain_button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.chsninc.ca/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
        TextView button6 = (TextView) view.findViewById(R.id.financial_strain_button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.communitylegalcentre.ca/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(launchBrowser);
            }
        });
    }
}
