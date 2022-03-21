package com.example.syarifah3;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class docterdrikhwandi extends ListActivity{
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct = new String[] {"call center","sms center","driving direction","website","info di google","exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("call center")){
                String nomortel = "tel:07619792324";
                a = new Intent(Intent.ACTION_DIAL,Uri.parse(nomortel));

            } else if (pilihan.equals("sms center"))
            {
                String smsText="syarifah H/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:083164532423"));
                a.putExtra("sms_body",smsText);

            } else if (pilihan.equals("driving direction")){
                String loc = "google.navigation:q=0.5285824288437765, 101.43961505606923";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(loc));
            }
            else if (pilihan.equals("website")){
                String website = "https://vymaps.com/ID/Jl-Cempaka-Dr-Ikhwandi-Sp-KK-327022970792413";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            }
            else if (pilihan.equals("info di google")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"dr.ikhwandi");
            }
            startActivity(a);

        } catch (Exception e )
        {
            e.printStackTrace();
        }
    }


}
