package com.kevin.fragment;

import com.kevin.view.PullToShowTabsListView;
import com.kevin.yireader.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * ¶©ÔÄ
 * 
 * @author Kevin
 * 
 */
public class SubscriptionFragment extends Fragment {

	private PullToShowTabsListView mSubscriptionListView;
	private LayoutInflater mLayoutInflater;

	public SubscriptionFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		mLayoutInflater = inflater;
		return inflater.inflate(R.layout.subscription_fragment_layout,
				container, false);
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		initView();
	}

	private void initView() {
		mSubscriptionListView = (PullToShowTabsListView) getView()
				.findViewById(R.id.subscription_list_view);
		mSubscriptionListView.setAdapter(new BrackAdapter());

	}

	class BrackAdapter extends BaseAdapter {

		@Override
		public int getCount() {

			return 100;
		}

		@Override
		public Object getItem(int position) {

			return null;
		}

		@Override
		public long getItemId(int position) {

			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = mLayoutInflater.inflate(
						R.layout.subscription_list_view_item, parent, false);
			}
			return convertView;
		}

	}

}
