package com.skcc;

public class â���۱� implements û���ϱ�{

	private String ���ȸ�ǽ�;
	private int �ɷ��Ǳ����� =5;

	
	public â���۱� (String ���ȸ�ǽ�) {
		this.���ȸ�ǽ� = ���ȸ�ǽ�;
	}
	
	public void â��û��() {
		
		if ( �ɷ��Ǳ����� < 0 ) {
			�ɷ��Ǳ����� =5;
		}
	}

	@Override
	public void û��() {
		// TODO Auto-generated method stub
		â��û��();
	}

	@Override
	public void ȸ�ǽ��̵�(String ȸ�ǽ�) {
		// TODO Auto-generated method stub
		this.���ȸ�ǽ�=ȸ�ǽ�;
	}
}
