package com.skcc;

public class �ٴ�û���ϱ� implements û���ϱ�{

	
	
	private String ���ȸ�ǽ�;
	private int �ɷ��Ǳ����� =5;
	private int �ν� = 10;
	
	
	public �ٴ�û���ϱ� (String ���ȸ�ǽ�) {
		this.���ȸ�ǽ� = ���ȸ�ǽ�;
	}
	
	public void �ٴ�û��() {
		
		if ( �ɷ��Ǳ����� < 0 ) {
			�ɷ��Ǳ����� =5;
		}
		if ( �ν� == 0 ) {
			�ν� = 10;
		}
		
	}

	@Override
	public void û��() {
		// TODO Auto-generated method stub
		�ٴ�û��();
	}

	@Override
	public void ȸ�ǽ��̵�(String ȸ�ǽ�) {
		// TODO Auto-generated method stub
		this.���ȸ�ǽ� = ȸ�ǽ�;
	}
}
