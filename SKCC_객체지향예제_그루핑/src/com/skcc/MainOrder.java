package com.skcc;

import java.util.ArrayList;

public class MainOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		회의실청소부문 부문_1 = new 회의실청소부문("판교오피스A동");
		부문_1.청소();
		
		ArrayList<회의실청소부문> 부문들 = new ArrayList();
		
		부문들.add(new 회의실청소부문("정자오피스10층이하"));
		부문들.add(new 회의실청소부문("종로오피스전체"));
		부문들.add(new 회의실청소부문("이천오피스A동"));
		
		for ( 회의실청소부문 부문 : 부문들 ) {
			부문.청소();
		}
		
		if(부문_1.청소완료()) {
			부문_1.회의실이동("판교오피스B동");
			부문_1.청소();
		}
	
	
	}

}
