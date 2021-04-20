package com.example.lesson4dz;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                return SecondFragment.newInstance("Value 1","Value 2");
            case 2:
                return ThirdFragment.newInstance("value 1","value 2");
            default:
                return  FirstFragment.newInstance("Value 1", "Value 2");
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
