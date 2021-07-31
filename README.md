# Android-Studio-Projects
Practice Projects for Android Development for Beginners  
[Tutorial Link](https://www.youtube.com/watch?v=fis26HvvDII&t=25022s&ab_channel=freeCodeCamp.org)

* [Ex1 Registration App](#ex1_registration_app)  
### Ex2 UI Basics  
### Ex3 Layouts  
### Ex4 Images  
### Ex5 ListView and Spinner  

### Ex1 Registration App  
```java
  TextView txtFirstName = findViewById(R.id.textViewFirstName);
  EditText edtTxtFirstName = findViewById(R.id.editTextFirstName);
  txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
```
### Ex2 UI Basics  
```java
package com.example.ex2uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtHello;
    private EditText edtTxtName;
    private CheckBox checkBoxHarry, checkBoxMatrix, checkBoxJoker;
    private RadioGroup rgMaritalStatus;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Button and text
        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Long Press", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        edtTxtName = findViewById(R.id.edtTxtName);
        edtTxtName.setOnClickListener(this);
        txtHello = findViewById(R.id.txtHello);

        // 2. Check box
        checkBoxHarry = findViewById(R.id.checkboxHarry);
        checkBoxMatrix = findViewById(R.id.checkboxMatrix);
        checkBoxJoker = findViewById(R.id.checkboxJoker);

        if(checkBoxHarry.isChecked()) {
            Toast.makeText(MainActivity.this, "You have watched Harry Potter, Yay", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You NEED to watch Harry Potter", Toast.LENGTH_SHORT).show();
        }

        checkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(MainActivity.this, "You have watched Harry Potter, Yay", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You NEED to watch Harry Potter", Toast.LENGTH_SHORT).show();
                }
            }
        });


        // 3. Radio group
        rgMaritalStatus = findViewById(R.id.rgMaritalStatus);
        int checkedButton = rgMaritalStatus.getCheckedRadioButtonId();
        switch(checkedButton) {
            case R.id.rbMarried:
                Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle:
                Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbInRel:
                Toast.makeText(MainActivity.this, "In a relationship", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbInRel:
                        Toast.makeText(MainActivity.this, "In a relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        // 4. Progress bar
        progressBar = findViewById(R.id.progressBar2);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHello:
                //Toast.makeText(this, "Hello Button Clicked", Toast.LENGTH_SHORT).show();
                txtHello.setText("Hello " + edtTxtName.getText().toString());
                break;
            case R.id.edtTxtName:
                Toast.makeText(this, "Attempt to type something", Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }
    /*
    public void onHelloBtnClicked(View view) {
        TextView txtWelcome = findViewById(R.id.txtWelcome);
        txtWelcome.setText("Hello Again");
    }
     */
}
```
### Ex3 Layouts  
### Ex4 Images  
### Ex5 ListView and Spinner  
###
###
