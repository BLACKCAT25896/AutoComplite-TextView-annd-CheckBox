package com.example.signupdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstName, lastName, email, password;
    private AutoCompleteTextView blood;
    private CheckBox termAndCondition;
    private Button signup;
    private String[] bloodGroup ={"A+","A-","AB+","AB-"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        blood = findViewById(R.id.blood);
        termAndCondition = findViewById(R.id.terms);
        signup = findViewById(R.id.signup);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,bloodGroup);
        blood.setAdapter(adapter);
        blood.setThreshold(1);
        termAndCondition.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    signup.setVisibility(View.VISIBLE);

                }else {
                    signup.setVisibility(View.INVISIBLE);
                }
            }
        });






    }
}
