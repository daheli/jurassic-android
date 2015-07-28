/*
 *  Copyright (c) 2013 The CCP project authors. All Rights Reserved.
 *
 *  Use of this source code is governed by a Beijing Speedtong Information Technology Co.,Ltd license
 *  that can be found in the LICENSE file in the root of the web site.
 *
 *   http://www.cloopen.com
 *
 *  An additional intellectual property rights grant can be found
 *  in the file PATENTS.  All contributing project authors may
 *  be found in the AUTHORS file in the root of the source tree.
 */package com.fivenglish.jurassic.ui;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.fivenglish.jurassic.R;
import com.fivenglish.jurassic.ui.base.BaseActivity;
import com.fivenglish.jurassic.ui.entry.LoginActivity;


/**
 * 
* <p>Title: LauncherActivity.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2013</p>
* <p>Company: http://www.cloopen.com</p>
* @author Jorstin Chan
* @date 2013-11-27
* @version 3.6
 */
public class LauncherActivity extends BaseActivity {
	public static final int SPLASH_DURATION = 2000;
	private static final int GO_MAIN_MSG = 1;
	private static final int GO_LOGIN_MSG = 2;

	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
				case GO_MAIN_MSG:
//					MainActivity.goMainActivityFromActivity(EntrySplashActivity.this);
					finish();
					break;
				case GO_LOGIN_MSG:
					Intent intent = new Intent(ctx, LoginActivity.class);
					ctx.startActivity(intent);
					finish();
					break;
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.launcher_activity);
//		if (AVUser.getCurrentUser() != null) {
//			UserService.updateUserInfo();
//			handler.sendEmptyMessageDelayed(GO_MAIN_MSG, SPLASH_DURATION);
//		} else {
			handler.sendEmptyMessageDelayed(GO_LOGIN_MSG, SPLASH_DURATION);
//		}
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {}

}