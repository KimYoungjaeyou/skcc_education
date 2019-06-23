package com.skcc;

public class 칠판닦기 implements 청소하기 {

	
	private String 담당회의실;
	private int 칠판지우개깨끗함 =5;
	
	public 칠판닦기 (String 담당회의실) {
		this.담당회의실 = 담당회의실;
	}
	
	public void 칠판청소() {
		
		if ( 칠판지우개깨끗함 < 0 ) {
			칠판지우개깨끗함 =5;
		}
		
	}

	@Override
	public void 청소() {
		// TODO Auto-generated method stub
		칠판청소(); 
	}

	@Override
	public void 회의실이동(String 회의실) {
		// TODO Auto-generated method stub
		this.담당회의실=회의실;
	}
	
}
