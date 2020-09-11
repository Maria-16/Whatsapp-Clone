package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Agree_terms extends AppCompatActivity {
        Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agree_terms);


        TextView textView = findViewById(R.id.agree_text);
        String text = "Read our Privacy Policy. Tap 'Agree and Continue' to accept the Terms of service.";
        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan blue = new ForegroundColorSpan(Color.BLUE);
        ForegroundColorSpan blue2 = new ForegroundColorSpan(Color.BLUE);

        ss.setSpan(blue, 8, 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(blue2, 60, 80, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);

        button = findViewById(R.id.agree_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Agree_terms.this, Phone_verify.class);
                startActivity(intent);
            }
        });
    }
}