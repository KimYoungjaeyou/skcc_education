package com.skcc;

import java.util.ArrayList;

public class MainOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		바닥청소하기 소영 = new 바닥청소하기("101호");
		소영.청소();
		바닥청소하기 윤경 = new 바닥청소하기("102호");
		윤경.청소();
		바닥청소하기 소희 = new 바닥청소하기("103호");
		소희.청소();
		바닥청소하기 소진 = new 바닥청소하기("104호");
		소진.청소();
	
		ArrayList<청소하기> 청소담당자들 = new ArrayList();
		청소담당자들.add(new 바닥청소하기("101호"));
		청소담당자들.add(new 바닥청소하기("102호"));
		청소담당자들.add(new 바닥청소하기("103호"));
		청소담당자들.add(new 바닥청소하기("104호"));
		
		청소담당자들.add(new 창문닦기("101호"));
		청소담당자들.add(new 창문닦기("102호"));
		청소담당자들.add(new 창문닦기("103호"));
		청소담당자들.add(new 창문닦기("104호"));
		
		청소담당자들.add(new 칠판닦기("101호"));
		청소담당자들.add(new 칠판닦기("102호"));
		청소담당자들.add(new 칠판닦기("103호"));
		청소담당자들.add(new 칠판닦기("104호")); 
		for (청소하기 담당 : 청소담당자들) {
			담당.청소();
		}
	
		
	}

}
