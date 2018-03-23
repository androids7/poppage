package com.jzj1993.fragmentlifecycle.Adapter;
import android.widget.*;
import android.view.*;
import java.util.*;
import android.content.*;
import com.jzj1993.fragmentlifecycle.*;

public class ChatListAdapter extends BaseAdapter
{

	private ListView listview;
	private List list;
	private ImageView img;
	public ChatListAdapter(Context context){
		
		View view=LayoutInflater.from(context).inflate(R.layout.chatlistview,null,false);
		View view2=LayoutInflater.from(context).inflate(R.layout.fragment_b,null,false);
		img=(ImageView)view.findViewById(R.id.image);
		
		list=new ArrayList<Integer>();
		
	}
	
	
	@Override
	public View getView(int p1, View p2, ViewGroup p3)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public int getCount()
	{
		// TODO: Implement this method
		return 0;
	}

	@Override
	public Object getItem(int p1)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public long getItemId(int p1)
	{
		// TODO: Implement this method
		return 0;
	}


	
	
}
