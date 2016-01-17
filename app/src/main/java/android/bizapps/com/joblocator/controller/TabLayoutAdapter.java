package android.bizapps.com.joblocator.controller;

import android.bizapps.com.joblocator.views.AppliedFrag;
import android.bizapps.com.joblocator.views.DeletedFrag;
import android.bizapps.com.joblocator.views.NewJobsFrag;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Murali on 1/10/2016.
 */
public class TabLayoutAdapter extends FragmentStatePagerAdapter {
    int mTabcount;

    public TabLayoutAdapter(FragmentManager fm,int Tabcount) {
        super(fm);
        this.mTabcount = Tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                DeletedFrag tab1 = new DeletedFrag();
                return tab1;
            case 1:
                NewJobsFrag tab2 = new NewJobsFrag();
                return tab2;
            case 2:
                AppliedFrag tab3 = new AppliedFrag();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mTabcount;
    }
}
