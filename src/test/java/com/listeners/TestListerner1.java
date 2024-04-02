package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListerner1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+"  test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+"  test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+"  test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+"  test case skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+"  test case failed due to success percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+"  test case failed due to timeout");
	}

	
	}

	

