package com.liferay.screenschallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.liferay.mobile.screens.auth.login.LoginListener;
import com.liferay.mobile.screens.auth.login.LoginScreenlet;
import com.liferay.mobile.screens.context.User;


public class LoginActivity extends AppCompatActivity implements LoginListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		//LoginScreenlet loginScreenlet = (LoginScreenlet) findViewById(R.id.activity_login);
		//loginScreenlet.setListener(this);
	}

	@Override
	public void onLoginSuccess(User user) {
		//System.out.println("Login is OK: " + user.getAttributes());
		startActivity(new Intent(this, FormActivity.class));
	}

	@Override
	public void onLoginFailure(Exception e) {
		//System.out.println("Login failed: " + e);
	}
}