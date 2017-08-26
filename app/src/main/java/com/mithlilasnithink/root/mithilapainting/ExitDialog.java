package com.mithlilasnithink.root.mithilapainting;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.widget.Toast;


/**
 * Created by snipthink  on 26/8/17.
 */

public class ExitDialog  extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder =new AlertDialog.Builder(getActivity());

       // builder.setTitle( Html.fromHtml("<font color='#FF7F27'>Set IP Address</font>"));


        builder.setMessage(R.string.exit)




                .setNegativeButton(R.string.No, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {



                    }
                })


           .setPositiveButton(R.string.yes , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getActivity(),"Application is clossing",Toast.LENGTH_LONG).show();
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

            }
        });

        return  builder.create();
    }
}