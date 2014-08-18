package com.kevin.yireader;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushManager;
import com.kevin.fragment.CloudReadFragment;
import com.kevin.fragment.MeFragment;
import com.kevin.fragment.DiscoverFragment;
import com.kevin.fragment.FriendsFragment;

public class MainActivity extends FragmentActivity implements
		OnCheckedChangeListener {

	private RadioGroup mTabHost;
	private FragmentManager mManager;
	private CloudReadFragment mCloudReadFragment;
	private MeFragment mMeFragment;
	private DiscoverFragment mDiscoverFragment;
	private FriendsFragment mFriendsFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Utils.logStringCache = Utils.getLogText(getApplicationContext());

		if (!Utils.hasBind(getApplicationContext())) {
			PushManager.startWork(getApplicationContext(),
					PushConstants.LOGIN_TYPE_API_KEY,
					Utils.getMetaValue(MainActivity.this, "api_key"));
		}

		mManager = getSupportFragmentManager();

		initView();
	}

	public void initView() {
		mTabHost = (RadioGroup) findViewById(R.id.tab_host);
		mTabHost.setOnCheckedChangeListener(this);

		mDiscoverFragment = new DiscoverFragment();
		mCloudReadFragment = new CloudReadFragment();
		mMeFragment = new MeFragment();
		mFriendsFragment = new FriendsFragment();

		mManager.beginTransaction()
				.add(R.id.main_container, mCloudReadFragment).commit();
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.read:
			mManager.beginTransaction()
					.replace(R.id.main_container, mCloudReadFragment).commit();
			break;
		case R.id.discover:
			mManager.beginTransaction()
					.replace(R.id.main_container, mDiscoverFragment).commit();
			break;
		case R.id.friends:
			mManager.beginTransaction()
					.replace(R.id.main_container, mFriendsFragment).commit();
			break;
		case R.id.me:
			mManager.beginTransaction()
					.replace(R.id.main_container, mMeFragment).commit();
			break;

		default:
			break;
		}

	}

}
