package com.company.mercacarapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.model.SliderPage;
public class PaperActivity extends AppIntro{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setProgressIndicator();
        setSkipButtonEnabled(false);
        showStatusBar(false);

        SliderPage pantalla1 = new SliderPage();
        pantalla1.setTitle(getString(R.string.title_pantalla_1));
        pantalla1.setTitleColor(Color.parseColor("#000000"));
        pantalla1.setDescription(getString(R.string.descripcion_pantalla_1));
        pantalla1.setImageDrawable(R.drawable.casa);
        pantalla1.setBackgroundDrawable(R.drawable.background_pantalla_1);

        SliderPage pantalla2 = new SliderPage();
        pantalla2.setTitle(getString(R.string.title_pantalla_2));
        pantalla2.setTitleColor(Color.parseColor("#000000"));
        pantalla2.setDescription(getString(R.string.descripcion_pantalla_2));
        pantalla2.setImageDrawable(R.drawable.coche);
        pantalla2.setBackgroundDrawable(R.drawable.background_pantalla_2);


        SliderPage pantalla3 = new SliderPage();
        pantalla3.setTitle(getString(R.string.title_pantalla_3));
        pantalla3.setTitleColor(Color.parseColor("#000000"));
        pantalla3.setDescription(getString(R.string.descripcion_pantalla_3));
        pantalla3.setImageDrawable(R.drawable.chat);
        pantalla3.setBackgroundDrawable(R.drawable.background_pantalla_3);

        addSlide(AppIntroFragment.newInstance(pantalla1));
        addSlide(AppIntroFragment.newInstance(pantalla2));
        addSlide(AppIntroFragment.newInstance(pantalla3));

    }


    @Override
    public void onDonePressed(Fragment currentFragment) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

