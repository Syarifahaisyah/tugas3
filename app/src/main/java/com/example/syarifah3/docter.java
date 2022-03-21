package com.example.syarifah3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class docter extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listdocter = new String[] {"dr.ikhwandi","dr.maria","dr.stepani"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listdocter));
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
            if (pilihan.equals("dr.ikhwandi")) {
                a = new Intent(this, docterdrikhwandi.class);

            }else if(pilihan.equals("dr.maria")) {

            }else if(pilihan.equals("dr.stepani"))  {

            }
            startActivity(a);

        } catch (Exception e )
        {
            e.printStackTrace();
        }
    }


}

