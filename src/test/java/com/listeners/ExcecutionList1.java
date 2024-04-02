package com.listeners;

import org.testng.IExecutionListener;

public class ExcecutionList1 implements IExecutionListener{

	@Override
	public void onExecutionStart() {
		System.out.println("test started");
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("test finished");
	}

}
