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

    @Override
    public void onClick(View view) {
        bgButton.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final CharSequence[] items = {getText(R.string.red), getText(R.string.yellow), getText(R.string.green)};
        builder.setTitle(R.string.message);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        constraintLayout.setBackgroundColor(R.color.ColorRed);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                    case 1:
                        constraintLayout.setBackgroundColor(R.color.ColorGreen);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                    case 2:
                        constraintLayout.setBackgroundColor(R.color.ColorYellow);
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}