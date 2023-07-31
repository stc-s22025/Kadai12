package com.example.kadai12;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Dialog extends DialogFragment {
    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("送信確認");
        builder.setPositiveButton("確認", new DialogButtonClickListener());
        builder.setNegativeButton("キャンセル", new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog, int which){
            String msg = "";
            switch (which){
                case DialogInterface.BUTTON_POSITIVE:
                    msg = "確認しました";
                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    msg = "キャンセルしました";
                    break;
            }
            Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
        }
    }
}
