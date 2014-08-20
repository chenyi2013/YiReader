package com.kevin.fragment;

import com.kevin.yireader.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * ‘”÷æ
 * 
 * @author Kevin
 * 
 */
public class JournalFragment extends Fragment {

	public JournalFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.journal_fragment_layout, container,
				false);
	}

}
