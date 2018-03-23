package com.jzj1993.fragmentlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.view.View.*;
import android.widget.ActionMenuView.*;
import android.view.*;

/**
 * Created by jzj on 16/9/5.
 */
public class BFragment extends BaseVisibilityFragment {

	
	private ImageView send_up;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		
		View view= inflater.inflate(R.layout.fragment_b, container, false);
		send_up=(ImageView)view.findViewById(R.id.fragmentbImageViewsendup);
		
		final View mview=inflater.inflate(R.layout.popupwindow,null,false);
		final PopupWindow pop=new PopupWindow(mview,LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		
		send_up.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				pop.setFocusable(true);
				pop.setOutsideTouchable(true);
				pop.showAtLocation(send_up,Gravity.TOP|Gravity.RIGHT,0,280);
				
			}
		});
		
		return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getContext(), NewActivity.class));
            }
        });
    }
}
