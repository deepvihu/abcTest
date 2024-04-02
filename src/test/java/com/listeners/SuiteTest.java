package com.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteTest implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("started");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("finished");
	}

}
