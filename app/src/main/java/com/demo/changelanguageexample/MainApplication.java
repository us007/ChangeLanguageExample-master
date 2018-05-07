package com.demo.changelanguageexample;

import android.app.Application;
import android.content.Context;

import com.demo.changelanguageexample.helper.LocaleHelper;

public class MainApplication extends Application {
	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
	}
}
