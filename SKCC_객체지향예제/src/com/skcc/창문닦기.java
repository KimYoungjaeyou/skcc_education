package com.skcc;

public class 창문닦기 {

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
}
