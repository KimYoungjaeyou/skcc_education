package com.skcc;

public class ȸ�ǽ�û�Һι�__ {

	private String ���ȸ�ǽ�;
		
	private �ٴ�û���ϱ� ��û_1��, ��û_2��;
	private â���۱� â��_1��, â��_2��;
	private ĥ�Ǵ۱� ĥ��_1��, ĥ��_2��;
	private IDCû�� IDC_û��_1��, IDC_û��_2��;
	
	
	private û���ϱ�[] ������ = {
			��û_1��,��û_2��,
			â��_1��,â��_2��,
			ĥ��_1��,ĥ��_2��,
			IDC_û��_1��,IDC_û��_2��
	};
	
	
	public ȸ�ǽ�û�Һι�__(String ���ȸ�ǽ�) {
		this.���ȸ�ǽ�=���ȸ�ǽ�;
		��û_1�� = new �ٴ�û���ϱ�(���ȸ�ǽ�);
		��û_2�� = new �ٴ�û���ϱ�(���ȸ�ǽ�);
		â��_1�� = new â���۱�(���ȸ�ǽ�);
		â��_2�� = new â���۱�(���ȸ�ǽ�);
		ĥ��_1�� = new ĥ�Ǵ۱�(���ȸ�ǽ�);
		ĥ��_2�� = new ĥ�Ǵ۱�(���ȸ�ǽ�);
		IDC_û��_1�� = new IDCû��(���ȸ�ǽ�);
		IDC_û��_2�� = new IDCû��(���ȸ�ǽ�);
	}
	
	public void û��() {
		for(û���ϱ� ���� : ������) {
			����.û��();
		}
	}
	
	public boolean û�ҿϷ�() {
		return true;
	}
	
	public void ȸ�ǽ��̵�(String ȸ�ǽ�) {
		for (û���ϱ� ���� : ������) {
			����.ȸ�ǽ��̵�(ȸ�ǽ�);
		}
	}
	
}
