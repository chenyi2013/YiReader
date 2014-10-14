package com.kevin.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import com.kevin.yireader.R;

public class DiscoverFragment extends Fragment {

	private LinearLayout mPublicBookLayout;

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
		mPublicBookLayout = (LinearLayout) getView().findViewById(
				R.id.public_book_layout);
		initView();
	}

	private void initView() {

		// init public book layout one
		LinearLayout layout = null;
		for (int i = 0; i < 6; i++) {

			if ((i) % 3 == 0) {

				layout = new LinearLayout(getActivity());
				LinearLayout.LayoutParams layoutParams = new LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				layout.setOrientation(LinearLayout.HORIZONTAL);
				layout.setLayoutParams(layoutParams);
				mPublicBookLayout.addView(layout);
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

		// init public book layout two

		for (int i = 0; i < 6; i++) {
			if ((i) % 3 == 0) {

				layout = new LinearLayout(getActivity());
				LinearLayout.LayoutParams layoutParams = new LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				layout.setOrientation(LinearLayout.HORIZONTAL);
				layout.setLayoutParams(layoutParams);
				mPublicBookLayout.addView(layout);
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

}
