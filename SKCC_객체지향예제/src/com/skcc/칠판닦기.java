package com.skcc;

public class 칠판닦기 {

	
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
	
}
