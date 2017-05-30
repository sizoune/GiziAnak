package com.kp.mwi.gizianak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by mwi on 5/25/17.
 */

public class IntroActivity extends AppIntro {
    private static boolean introLoaded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setColorSkipButton(getResources().getColor(R.color.hitam));
//        setColorDoneText(getResources().getColor(R.color.hitam));
//        setIndicatorColor(R.color.putih, R.color.hitam);

        if (introLoaded) {
            startActivity(new Intent(IntroActivity.this, MainActivity.class));
            finish();
        }

        setDoneText("Lanjut");
        addSlide(AppIntroFragment.newInstance("Kurva Pertumbuhan Anak", "Cara mudah untuk memantau " +
                        "dan mengetahui status gizi dan berat badan ideal buah hati anda",
                R.drawable.ic_child, getResources().getColor(R.color.hijauaplikasi)));

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        introLoaded = true;
        startActivity(new Intent(IntroActivity.this, MainActivity.class));
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        introLoaded = true;
        startActivity(new Intent(IntroActivity.this, MainActivity.class));
        finish();
    }
}
