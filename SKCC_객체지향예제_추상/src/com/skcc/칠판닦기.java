package com.skcc;

public class ĥ�Ǵ۱� implements û���ϱ� {

	
	private String ���ȸ�ǽ�;
	private int ĥ�����찳������ =5;
	
	public ĥ�Ǵ۱� (String ���ȸ�ǽ�) {
		this.���ȸ�ǽ� = ���ȸ�ǽ�;
	}
	
	public void ĥ��û��() {
		
		if ( ĥ�����찳������ < 0 ) {
			ĥ�����찳������ =5;
		}
		
	}

	@Override
	public void û��() {
		// TODO Auto-generated method stub
		ĥ��û��(); 
	}

	@Override
	public void ȸ�ǽ��̵�(String ȸ�ǽ�) {
		// TODO Auto-generated method stub
		this.���ȸ�ǽ�=ȸ�ǽ�;
	}
	
}
