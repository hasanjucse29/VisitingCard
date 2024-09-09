package com.example.lab4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void pressPhone(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01306380171"));
        startActivity(intent);
    }

    public void pressFb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/hasanalmamun22"));
        startActivity(intent);
    }

    public void pressLinkedIn(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bd.linkedin.com/in/hasan-al-mamun-19464b190"));
        startActivity(intent);
    }

    public void pressGitHub(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/hasanjucse29"));
        startActivity(intent);
    }


    public void pressMail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:jucse29.399@gmail.com"));
        startActivity(intent);
    }



}