package android.bizapps.com.joblocator.views;

import android.bizapps.com.joblocator.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Murali on 1/9/2016.
 */
public class NewJobsFrag extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View newjobView = inflater.inflate(R.layout.newjobs_fragment, container, false);
        return newjobView;
    }
}
