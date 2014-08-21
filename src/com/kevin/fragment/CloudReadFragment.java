package com.kevin.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.kevin.yireader.R;

public class CloudReadFragment extends Fragment implements
		OnCheckedChangeListener, OnPageChangeListener {

	private ViewPager mCloudViewPager;
	private List<Fragment> mFragments;
	private CloudReadAdapter mAdapter;
	private RadioGroup mCloudReadTabhost;

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		return inflater.inflate(R.layout.cloud_read_fragment_layout, container,
				false);
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {

		super.onActivityCreated(savedInstanceState);

		initData();
		initView();

	}

	public void initView() {
		mCloudReadTabhost = (RadioGroup) getView().findViewById(
				R.id.read_radio_group);
		mCloudReadTabhost.setOnCheckedChangeListener(this);
		mCloudViewPager = (ViewPager) getView().findViewById(
				R.id.cloud_view_pager);
		mCloudViewPager.setOnPageChangeListener(this);
		mAdapter = new CloudReadAdapter(getChildFragmentManager());
		mCloudViewPager.setAdapter(mAdapter);
	}

	public void initData() {

		mFragments = new ArrayList<Fragment>();

		mFragments.add(new BookrackFragment());
		mFragments.add(new SubscriptionFragment());
		mFragments.add(new JournalFragment());
		mFragments.add(new RecommendFragment());

	}

	class CloudReadAdapter extends FragmentPagerAdapter {

		public CloudReadAdapter(FragmentManager fm) {
			super(fm);

		}

		@Override
		public Fragment getItem(int position) {

			return mFragments.get(position);
		}

		@Override
		public int getCount() {

			return mFragments.size();
		}

	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {

		for (int i = 0; i < group.getChildCount(); i++) {
			if (checkedId == group.getChildAt(i).getId()) {
				mCloudViewPager.setCurrentItem(i, true);
			}
		}
	}

	@Override
	public void onPageScrollStateChanged(int state) {

	}

	@Override
	public void onPageScrolled(int position, float positionOffset,
			int positionOffsetPixels) {

	}

	@Override
	public void onPageSelected(int position) {
		mCloudReadTabhost.check(mCloudReadTabhost.getChildAt(position).getId());
	}

}
