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
import java.util.*;
import android.app.FragmentManager;
import android.os.*;

public class MainActivity extends AppCompatActivity  {

    private ViewPager mPager;
    private FragmentPagerAdapter mAdapter;
    private AFragment mAFragment ;
    private BFragment mBFragment ;
    private CFragment mCFragment ;
	private DFragment mDFragment ;
	private EFragment mEFragment ;
	
	private List<Object> list;
	
	
	private ImageView home,message,add,search,work;
	/*
	private Thread td;
	
	private Handler hd;
	*/
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
		
		
		mAFragment = new AFragment();
        mBFragment = new BFragment();
        mCFragment = new CFragment();
	    mDFragment = new DFragment();
		mEFragment = new EFragment();
		list=new ArrayList<Object>();
		
		list.add(mAFragment);
		list.add(mBFragment);
		list.add(mCFragment);
		list.add(mDFragment);
		list.add(mEFragment);
		/*
		initThread();
		td.start();
		*/
		
		
		
		
		
        mPager = (ViewPager) findViewById(R.id.pager);
        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
				/*
				currentPostion=position;
				if (currentPostion==0){
					home.setColorFilter(Color.argb(25,0,100,100));
					
				}
				*/
				
				
				
				/*
				
                switch (position) {
                    case 0:
						
						return mAFragment;
                    case 1:
						
                        return mBFragment;
                    case 2:
                        return mCFragment;
                }
				
				*/
                return (BaseVisibilityFragment)list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
			
		
			
			
		@Override
		public void destroyItem(ViewGroup contian,int position,Object obj)
		{
			
	
			
		}
		
			
			
			
			
        };
		
		
		
		
        mPager.setAdapter(mAdapter);
		
		mPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener()
		{
			public void onPageScrolled(int p,float b,int c)
			{
				
			}
			public void onPageSelected(int position)
			{
				switch(position){
					case 0:
						home.setColorFilter(Color.argb(25,0,100,100));
						message.setColorFilter(Color.argb(0,0,0,0));
						search.setColorFilter(Color.argb(0,0,0,0));
						work.setColorFilter(Color.argb(0,0,0,0));
						break;
					case 1:

						message.setColorFilter(Color.argb(25,0,100,100));
						home.setColorFilter(Color.argb(0,0,0,0));
						search.setColorFilter(Color.argb(0,0,0,0));
						work.setColorFilter(Color.argb(0,0,0,0));


						break;


					case 2:
						message.setColorFilter(Color.argb(0,0,0,0));
						home.setColorFilter(Color.argb(0,0,0,0));
						search.setColorFilter(Color.argb(0,0,0,0));
						work.setColorFilter(Color.argb(0,0,0,0));
						


						break;


					case 3:

						search.setColorFilter(Color.argb(25,0,100,100));
						message.setColorFilter(Color.argb(0,0,0,0));
						home.setColorFilter(Color.argb(0,0,0,0));
						work.setColorFilter(Color.argb(0,0,0,0));


						break;

					case 4:
						work.setColorFilter(Color.argb(25,0,100,100));
						message.setColorFilter(Color.argb(0,0,0,0));
						home.setColorFilter(Color.argb(0,0,0,0));
						search.setColorFilter(Color.argb(0,0,0,0));

						break;
						
				}
			}
			
			public void onPageScrollStateChanged(int p)
			{
				
			}
			
			
		});
		
		
		home=(ImageView)findViewById(R.id.activitymainImageViewhome);
		
		message=(ImageView)findViewById(R.id.activitymainImageViewmessage);
		
		add=(ImageView)findViewById(R.id.activitymainImageViewadd);

		search=(ImageView)findViewById(R.id.activitymainImageViewsearch);
		
		work=(ImageView)findViewById(R.id.activitymainImageViewwork);
		
		
		
		
		
		
		
		home.setColorFilter(Color.argb(25,0,100,100));
		
		

		home.setOnClickListener(new OnClickListener(){
		public void onClick(View v)
		{
			mPager.setCurrentItem(0);
		}
			
		});
		
		
		
		message.setOnClickListener(new OnClickListener(){
				public void onClick(View v)
				{
					mPager.setCurrentItem(1);
				}

			});
			
			
		search.setOnClickListener(new OnClickListener(){
				public void onClick(View v)
				{
					mPager.setCurrentItem(3);
				}

			});
			
			
			
		work.setOnClickListener(new OnClickListener(){
				public void onClick(View v)
				{
					mPager.setCurrentItem(4);
				}

			});
			
			
		add.setOnClickListener(new OnClickListener(){
				public void onClick(View v)
				{
					//mPager.setCurrentItem(0);
				}

			});
		
		
    }
	
	
	
	public void ts(Object o)
	{
		Toast.makeText(getBaseContext(),o.toString(),0).show();
	}
	
	/*
	public void initThread()
	{
		
		hd=new Handler(){
			public void handleMessage(Message msg)
			{
				super.handleMessage(msg);
				
				switch(msg.what){
					
					case 0x10:
						
						switch(msg.arg1){
							case 0:
								home.setColorFilter(Color.argb(25,0,100,100));
								message.setColorFilter(Color.argb(0,0,0,0));
								search.setColorFilter(Color.argb(0,0,0,0));
								work.setColorFilter(Color.argb(0,0,0,0));
								break;
							case 1:

								message.setColorFilter(Color.argb(25,0,100,100));
								home.setColorFilter(Color.argb(0,0,0,0));
								search.setColorFilter(Color.argb(0,0,0,0));
								work.setColorFilter(Color.argb(0,0,0,0));


								break;


							case 2:



								break;


							case 3:

								search.setColorFilter(Color.argb(25,0,100,100));
								message.setColorFilter(Color.argb(0,0,0,0));
								home.setColorFilter(Color.argb(0,0,0,0));
								work.setColorFilter(Color.argb(0,0,0,0));


								break;

							case 4:
								work.setColorFilter(Color.argb(25,0,100,100));
								message.setColorFilter(Color.argb(0,0,0,0));
								home.setColorFilter(Color.argb(0,0,0,0));
								search.setColorFilter(Color.argb(0,0,0,0));

								break;

						}
						
					break;
				}
			}
		};
		
		td=new Thread()
		{
			public void run()
			{
				while(true)
				{
					for(int i=0;i<list.size();i++)
					{
					
						BaseVisibilityFragment bf=(BaseVisibilityFragment)list.get(i);
					
				       int b=   mAdapter.getItemPosition(bf);
					
							Message msg=new Message();
							msg.arg1=b;
							hd.sendMessage(msg);
					}
						
						
					
				
				try
				{
					sleep(900);
				}
				catch (InterruptedException e)
				{}
			}
			}
			
		};
	}
	
	*/
	
	
}
