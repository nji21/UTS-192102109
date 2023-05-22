package com.example.uts_192102109;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.security.PublicKey;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private WebResmiFragment _webResmiFragment = new WebResmiFragment();
    private Context _context;
    private WebInternalFragment _webInternalFragment = new WebInternalFragment();
    private int _tabCount;

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return  _webInternalFragment;
            default:
                return  _webResmiFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}
