package com.jzj1993.fragmentlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.view.View.*;

/**
 * Created by jzj on 16/9/5.
 */
public class AFragment extends BaseVisibilityFragment implements OnClickListener{

	private ImageView care,remen,homeshow;
	
	private boolean isRemen=true;
	
	
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        
		View view= inflater.inflate(R.layout.fragment_a, null, false);
		care=(ImageView)view. findViewById(R.id.fragmentaImageViewcare);

		homeshow=(ImageView)view.findViewById(R.id.fragmentaImageViewhomeshow);

		remen=(ImageView)view.findViewById(R.id.fragmentaImageViewremen);
		
		

		checkRemen();

		remen.setOnClickListener(this);



		care.setOnClickListener(this);
		
		
		return view;
	
    }

	@Override
	public void onClick(View p1)
	{
		switch(p1.getId()){
			case R.id.fragmentaImageViewremen:
				
				isRemen=true;
				checkRemen();
			break;
		   
			case R.id.fragmentaImageViewcare:
				isRemen=false;
				checkRemen();
			break;
				
		}
	}


	

	
	
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
		
		
		
		
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(getContext(), NewActivity.class));
            }
        });
    }
	
	public void checkRemen(){

		if (isRemen==true)
		{
			remen.setImageResource(R.drawable.remen_yellow);
			care.setImageResource(R.drawable.care);
			homeshow.setImageResource(R.drawable.hot);

		} else{
			remen.setImageResource(R.drawable.remen);
			care.setImageResource(R.drawable.care_yellow);
			homeshow.setImageResource(R.drawable.care_about);
		}


	}
	
}
