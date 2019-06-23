package com.skcc;

public class 바닥청소하기 {

	
	
	private String 담당회의실;
	private int 걸레의깨끗함 =5;
	private int 왁스 = 10;
	
	
	public 바닥청소하기 (String 담당회의실) {
		this.담당회의실 = 담당회의실;
	}
	
	public void 바닥청소() {
		
		if ( 걸레의깨끗함 < 0 ) {
			걸레의깨끗함 =5;
		}
		if ( 왁스 == 0 ) {
			왁스 = 10;
		}
		
	}
}
