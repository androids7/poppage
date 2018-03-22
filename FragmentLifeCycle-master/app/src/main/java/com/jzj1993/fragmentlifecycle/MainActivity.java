package com.jzj1993.fragmentlifecycle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.graphics.*;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;
    private FragmentPagerAdapter mAdapter;
    private AFragment mAFragment = new AFragment();
    private BFragment mBFragment = new BFragment();
    private CFragment mCFragment = new CFragment();

	
	private ImageView home,message;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPager = (ViewPager) findViewById(R.id.pager);
        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
						home.setColorFilter(Color.argb(25,0,100,100));
                        return mAFragment;
                    case 1:
						home.setColorFilter(Color.argb(0,0,0,0));
						
                        return mBFragment;
                    case 2:
                        return mCFragment;
                }
                return null;
            }

            @Override
            public int getCount() {
                return 3;
            }
        };
        mPager.setAdapter(mAdapter);
		
		home=(ImageView)findViewById(R.id.activitymainImageViewhome);
		
		message=(ImageView)findViewById(R.id.activitymainImageViewmessage);
		
		home.setOnClickListener(new OnClickListener(){
		public void onClick(View v)
		{
			
		}
			
		});
    }
}
