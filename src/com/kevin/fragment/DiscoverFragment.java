package com.kevin.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import com.kevin.view.CirclePageIndicator;
import com.kevin.yireader.R;

public class DiscoverFragment extends Fragment {

	private LinearLayout mPublicBookLayout;
	private LinearLayout mBoyMustReadLayout;
	private LinearLayout mBoyMustReadListLayout;
	private LinearLayout mGrilLoveLookLayout;
	private LinearLayout mGrilLoveListLayout;
	private LinearLayout mCartoonLayout;
	private LinearLayout mReadLayout;
	private ViewPager mViewPager;
	private CirclePageIndicator mCirclePageIndicator;

	public DiscoverFragment() {

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.discover_fragment_layout, container,
				false);

	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		initView();
	}

	private void initView() {

		mPublicBookLayout = (LinearLayout) getView().findViewById(
				R.id.public_book_layout);
		mBoyMustReadLayout = (LinearLayout) getView().findViewById(
				R.id.boy_must_read_layout);
		mBoyMustReadListLayout = (LinearLayout) getView().findViewById(
				R.id.boy_must_read_list_layout);
		mGrilLoveLookLayout = (LinearLayout) getView().findViewById(
				R.id.gril_love_look_layout);
		mGrilLoveListLayout = (LinearLayout) getView().findViewById(
				R.id.gril_love_list_layout);
		mCartoonLayout = (LinearLayout) getView().findViewById(
				R.id.cartoon_layout);
		mReadLayout = (LinearLayout) getView().findViewById(R.id.read_layout);
		mViewPager = (ViewPager) getView().findViewById(R.id.view_pager);
		mCirclePageIndicator = (CirclePageIndicator) getView().findViewById(
				R.id.circle_pager_indicator);
		mViewPager.setAdapter(new ViewPagerAdater());
		mCirclePageIndicator.setViewPager(mViewPager);

		initGridLayout1(mPublicBookLayout);
		initGridLayout2(mPublicBookLayout);
		initGridLayout1(mBoyMustReadLayout);
		initListLayout(mBoyMustReadListLayout);
		initGridLayout1(mGrilLoveLookLayout);
		initListLayout(mGrilLoveListLayout);
		initGridLayout2(mCartoonLayout);
		initGridLayout2(mReadLayout);

	}

	private void initGridLayout1(LinearLayout linearLayout) {

		LinearLayout layout = null;
		for (int i = 0; i < 6; i++) {

			if ((i) % 3 == 0) {

				layout = new LinearLayout(getActivity());
				LinearLayout.LayoutParams layoutParams = new LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				layout.setOrientation(LinearLayout.HORIZONTAL);
				layout.setLayoutParams(layoutParams);
				linearLayout.addView(layout);
			}

			TextView tv = new TextView(getActivity());
			LinearLayout.LayoutParams tvLayoutParams = new LayoutParams(0,
					LayoutParams.WRAP_CONTENT);
			tvLayoutParams.weight = 1;
			tvLayoutParams.setMargins(10, 10, 10, 10);
			tv.setLayoutParams(tvLayoutParams);
			tv.setText("流行小说");
			tv.setGravity(Gravity.CENTER);
			tv.setPadding(10, 10, 10, 10);
			tv.setBackgroundColor(0xff78dfad);
			layout.addView(tv);

		}

	}

	private void initGridLayout2(LinearLayout linLayout) {

		LinearLayout layout = null;
		for (int i = 0; i < 6; i++) {
			if ((i) % 3 == 0) {

				layout = new LinearLayout(getActivity());
				LinearLayout.LayoutParams layoutParams = new LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				layout.setOrientation(LinearLayout.HORIZONTAL);
				layout.setLayoutParams(layoutParams);
				linLayout.addView(layout);
			}

			LinearLayout linearLayout = (LinearLayout) getActivity()
					.getLayoutInflater().inflate(R.layout.public_book_item,
							layout, false);
			LinearLayout.LayoutParams layoutParams = (LayoutParams) linearLayout
					.getLayoutParams();
			layoutParams.weight = 1;
			layoutParams.width = 0;
			linearLayout.setLayoutParams(layoutParams);
			linearLayout.setPadding(10, 10, 10, 20);
			layout.addView(linearLayout);

		}
	}

	private void initListLayout(LinearLayout linearLayout) {

		LinearLayout.LayoutParams lineLayoutParams = null;
		LinearLayout.LayoutParams textViewLayoutParams = null;

		for (int i = 0; i < 4; i++) {
			View line = new View(getActivity());
			lineLayoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, 1);
			lineLayoutParams.weight = 0;
			line.setBackgroundColor(0xffeeeeee);
			line.setLayoutParams(lineLayoutParams);
			linearLayout.addView(line);

			TextView textView = new TextView(getActivity());
			textViewLayoutParams = new LayoutParams(LayoutParams.MATCH_PARENT,
					0);
			textViewLayoutParams.weight = 1;
			textView.setLayoutParams(textViewLayoutParams);
			textView.setText("[xxxx] xxxxxxxxxxxxxxxx");
			textView.setPadding(0, 10, 0, 10);
			linearLayout.addView(textView);

		}

	}

	class ViewPagerAdater extends PagerAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 6;
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			return arg0 == arg1;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {

			ImageView img = new ImageView(getActivity());
			ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
			layoutParams.width = ViewPager.LayoutParams.MATCH_PARENT;
			layoutParams.height = ViewPager.LayoutParams.MATCH_PARENT;
			img.setLayoutParams(layoutParams);
			img.setImageResource(R.drawable.ic_launcher);
			container.addView(img);
			return img;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {

			container.removeView((View) object);
		}
	}
}
