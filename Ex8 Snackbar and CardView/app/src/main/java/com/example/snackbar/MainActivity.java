package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout parent;
    private Button btnShowSnackbar;
    private MaterialCardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.parent);
        btnShowSnackbar = findViewById(R.id.btnShowSnackbar);
        cardView = findViewById(R.id.cardView);

        // Snackbar
        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackbar();
            }
        });

        // CardView
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Card Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showSnackbar() {
        Snackbar.make(parent, "This is a Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retry Click", Toast.LENGTH_SHORT).show();
                    }
                })
//                .setActionTextColor(getColor(R.color.purple_700))
//                .setActionTextColor(getResources().getColor(R.color.purple_700))
                .setActionTextColor(Color.RED)      //Color of "Retry"
                .setTextColor(Color.YELLOW)     //Color of "This is a Snackbar"
                .show();
    }
}