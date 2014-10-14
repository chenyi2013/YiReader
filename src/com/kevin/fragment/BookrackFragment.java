package com.kevin.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.kevin.view.PullToShowTabsListView;
import com.kevin.view.PullToShowTabsListView.OnClickTabsListener;
import com.kevin.yireader.R;

/**
 *  Èº‹
 * 
 * @author Kevin
 * 
 */
public class BookrackFragment extends Fragment implements OnClickTabsListener {

	private PullToShowTabsListView mListView;
	private LayoutInflater mLayoutInflater;

	public BookrackFragment() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		mLayoutInflater = inflater;
		return inflater.inflate(R.layout.bookrack_fragment_layout, container,
				false);
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {

		super.onActivityCreated(savedInstanceState);
		mListView = (PullToShowTabsListView) getView().findViewById(
				R.id.bookrack_list_view);
		View view = mLayoutInflater.inflate(R.layout.list_book, null, false);
		mListView.addHeaderView(view);
		mListView.setOnClickTabsListener(this);
		mListView.setAdapter(new BrackAdapter());

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
						R.layout.bookrack_list_item, parent, false);
			}
			return convertView;
		}

	}

	@Override
	public void onClick(int id) {

		Toast.makeText(getActivity(), "hello" + id, Toast.LENGTH_LONG)
				.show();
	}

}
