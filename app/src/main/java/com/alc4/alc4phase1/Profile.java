package com.alc4.alc4phase1;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Profile extends AppCompatActivity {

    Animation fadeIn;
    ConstraintLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        myLayout = findViewById(R.id.myLayout);
        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        myLayout.setAnimation(fadeIn);
    }
}
