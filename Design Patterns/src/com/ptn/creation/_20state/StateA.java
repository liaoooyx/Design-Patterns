package com.ptn.creation._20state;

public class StateA extends State{

	@Override
	public void firstStep() {
		System.out.println("执行第一步");
		context.changeState(Context.STATEB);
	}

	@Override
	public void secondStep() {
		System.out.println("无法执行第二步");
	}

	@Override
	public void thirdStep() {
		// TODO Auto-generated method stub
		System.out.println("无法执行第三步");
	}

}
