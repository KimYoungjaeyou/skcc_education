package com.skcc;

import java.util.ArrayList;

public class MainOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		ȸ�ǽ�û�Һι� �ι�_1 = new ȸ�ǽ�û�Һι�("�Ǳ����ǽ�A��");
		�ι�_1.û��();
		
		ArrayList<ȸ�ǽ�û�Һι�> �ι��� = new ArrayList();
		
		�ι���.add(new ȸ�ǽ�û�Һι�("���ڿ��ǽ�10������"));
		�ι���.add(new ȸ�ǽ�û�Һι�("���ο��ǽ���ü"));
		�ι���.add(new ȸ�ǽ�û�Һι�("��õ���ǽ�A��"));
		
		for ( ȸ�ǽ�û�Һι� �ι� : �ι��� ) {
			�ι�.û��();
		}
		
		if(�ι�_1.û�ҿϷ�()) {
			�ι�_1.ȸ�ǽ��̵�("�Ǳ����ǽ�B��");
			�ι�_1.û��();
		}
	
	
	}

}
