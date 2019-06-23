package com.skcc;

public class 창문닦기 implements 청소하기{

	private String 담당회의실;
	private int 걸레의깨끗함 =5;

	
	public 창문닦기 (String 담당회의실) {
		this.담당회의실 = 담당회의실;
	}
	
	public void 창문청소() {
		
		if ( 걸레의깨끗함 < 0 ) {
			걸레의깨끗함 =5;
		}
	}

	@Override
	public void 청소() {
		// TODO Auto-generated method stub
		창문청소();
	}

	@Override
	public void 회의실이동(String 회의실) {
		// TODO Auto-generated method stub
		this.담당회의실=회의실;
	}
}
