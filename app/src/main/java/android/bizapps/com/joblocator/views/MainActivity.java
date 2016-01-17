package android.bizapps.com.joblocator.views;

import android.bizapps.com.joblocator.R;
import android.bizapps.com.joblocator.controller.TabLayoutAdapter;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String json = null;
        try {
            InputStream in = getAssets().open("CompanyJSON");
            int size = in.available();
            byte[] buffer = new byte[size];
            in.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        JSONObject jsonObject=new JSONObject();

        JSONArray jsonArray=jsonObject.optJSONArray("CompanyJSON");
        for(int i=0; i < jsonArray.length(); i++){
            try {
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            int id = Integer.parseInt(jsonObject.optString("id").toString());
            String name = jsonObject.optString("name").toString();
            float salary = Float.parseFloat(jsonObject.optString("salary").toString());

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("DELETED"));
        tabLayout.addTab(tabLayout.newTab().setText("NEW JOBS"));
        tabLayout.addTab(tabLayout.newTab().setText("APPLIED"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final TabLayoutAdapter adapter = new TabLayoutAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                switch (tab.getPosition()) {
                    case 0:
                    case 1:
                    case 2:
                        //Applied Fragment
                        // TODO
                        // First get the datasource object
                        // Pass the data source to adapter (Recycler adapter) by adding a constructoer in adapter
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}