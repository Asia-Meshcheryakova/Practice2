package ru.mirea.meshcheryakova.practice2;

import android.app.ProgressDialog;
import android.content.Context;

public class MyProgressDialogFragment {
    public MyProgressDialogFragment(Context context){
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.show();
        progressDialog.setTitle("Mirea");
        progressDialog.setMessage("Подождите чуть чуть!");
        progressDialog.show();
    }
}