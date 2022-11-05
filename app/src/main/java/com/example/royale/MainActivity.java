package com.example.royale;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.Console;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button bgButton;
    public RelativeLayout relativeLayout;
    public ConstraintLayout constraintLayout;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgButton = (Button)findViewById(R.id.button);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativelayout);
        context = MainActivity.this;
        constraintLayout = (ConstraintLayout)findViewById(R.id.constraintLayout);

    }


    public void onClick(View view) {
        bgButton.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        CharSequence[] items = {getText(R.string.red), getText(R.string.green), getText(R.string.yellow)};
        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Toast.makeText(context, R.string.wred, Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.ColorRed);
                        break;
                    case 1:
                        Toast.makeText(context, R.string.wgreen, Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.ColorGreen);
                        break;
                    case 2:
                        Toast.makeText(context, R.string.wyellow, Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.ColorYellow);
                        break;
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}