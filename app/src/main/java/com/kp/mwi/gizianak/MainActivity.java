package com.kp.mwi.gizianak;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kp.mwi.gizianak.Fragment.IdentitasBaruFragment;
import com.kp.mwi.gizianak.Fragment.IdentitasLamaFragment;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements IdentitasBaruFragment.newData {
    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 2;
    private HashMap<Integer, Fragment> refFragmentMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
                if (viewPager.getAdapter().getCount() == 1) {
                    viewPager.getAdapter().notifyDataSetChanged();
                }
            }
        });


    }

    @Override
    public void onNewData() {
        MyAdapter adapter = ((MyAdapter) viewPager.getAdapter());
        IdentitasLamaFragment lama = (IdentitasLamaFragment) adapter.getFragment(1);
        lama.onNewData();
    }


    class MyAdapter extends FragmentStatePagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return fragment with respect to Position .
         */

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Fragment baru = new IdentitasBaruFragment();
                    refFragmentMap.put(position, baru);
                    return baru;
                case 1:
                    Fragment lama = new IdentitasLamaFragment();
                    refFragmentMap.put(position, lama);
                    return lama;

            }
            return null;
        }

        @Override
        public int getCount() {

            return int_items;

        }

        /**
         * This method returns the title of the tab according to the position.
         */

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Identitas Baru";
                case 1:
                    return "Identitas Lama";
            }
            return null;
        }

        public void destroyItem(View container, int position, Object object) {
            super.destroyItem(container, position, object);
            refFragmentMap.remove(position);
        }

        public Fragment getFragment(int key) {
            return refFragmentMap.get(key);
        }

        public int getItemPosition(Object object) {
            return POSITION_NONE;
        }
    }
}
