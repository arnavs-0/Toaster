package com.arnav.toastersample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;

import com.arnav.toaster.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button success = findViewById(R.id.success);
        Button error = findViewById(R.id.error);
        Button warning = findViewById(R.id.warning);
        Button info = findViewById(R.id.info);
        Button normal = findViewById(R.id.normal);
        Button custom = findViewById(R.id.custom);
        Button noIcon = findViewById(R.id.no_icon);

        success.setOnClickListener(view -> {
            Toaster.makeText(this, "Success", Toaster.LENGTH_SHORT, Toaster.SUCCESS).show();
        });

        error.setOnClickListener(view -> {
            Toaster.makeText(this, "Error", Toaster.LENGTH_SHORT, Toaster.ERROR).show();
        });

        warning.setOnClickListener(view -> {
            Toaster.makeText(this, "Warning", Toaster.LENGTH_SHORT, Toaster.WARNING).show();
        });

        info.setOnClickListener(view -> {
            Toaster.makeText(this, "Info", Toaster.LENGTH_SHORT, Toaster.INFO).show();
        });

        normal.setOnClickListener(view -> {
            Toaster.makeText(this, "Success", Toaster.LENGTH_SHORT, Toaster.DEFAULT).show();
        });

        custom.setOnClickListener(view -> {
            Toaster.makeTextCustom(this, "Custom with Icon", Toaster.LENGTH_SHORT,
                    this.getDrawable(R.drawable.custom), this.getDrawable(R.drawable.ic_baseline_android_24)).show();
        });

        noIcon.setOnClickListener(view -> {
            Toaster.makeTextBackground(this, "Custom No Icon", Toaster.LENGTH_SHORT,
                    this.getDrawable(R.drawable.custom), "#000000").show();
        });
    }
}