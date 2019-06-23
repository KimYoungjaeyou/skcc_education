package com.skcc;

public class È¸ÀÇ½ÇÃ»¼ÒºÎ¹® {


	private String ´ã´çÈ¸ÀÇ½Ç;
		
	private ¹Ù´ÚÃ»¼ÒÇÏ±â ¹ÙÃ»_1ÆÀ, ¹ÙÃ»_2ÆÀ;
	private Ã¢¹®´Û±â Ã¢´Û_1ÆÀ, Ã¢´Û_2ÆÀ;
	private Ä¥ÆÇ´Û±â Ä¥´Û_1ÆÀ, Ä¥´Û_2ÆÀ;
	
	
	private Ã»¼ÒÇÏ±â[] ÆÀ¿øµé = {
			¹ÙÃ»_1ÆÀ,¹ÙÃ»_2ÆÀ,
			Ã¢´Û_1ÆÀ,Ã¢´Û_2ÆÀ,
			Ä¥´Û_1ÆÀ,Ä¥´Û_2ÆÀ,
	};
	
	
	public È¸ÀÇ½ÇÃ»¼ÒºÎ¹®(String ´ã´çÈ¸ÀÇ½Ç) {
		this.´ã´çÈ¸ÀÇ½Ç=´ã´çÈ¸ÀÇ½Ç;
		¹ÙÃ»_1ÆÀ = new ¹Ù´ÚÃ»¼ÒÇÏ±â(´ã´çÈ¸ÀÇ½Ç);
		¹ÙÃ»_2ÆÀ = new ¹Ù´ÚÃ»¼ÒÇÏ±â(´ã´çÈ¸ÀÇ½Ç);
		Ã¢´Û_1ÆÀ = new Ã¢¹®´Û±â(´ã´çÈ¸ÀÇ½Ç);
		Ã¢´Û_2ÆÀ = new Ã¢¹®´Û±â(´ã´çÈ¸ÀÇ½Ç);
		Ä¥´Û_1ÆÀ = new Ä¥ÆÇ´Û±â(´ã´çÈ¸ÀÇ½Ç);
		Ä¥´Û_2ÆÀ = new Ä¥ÆÇ´Û±â(´ã´çÈ¸ÀÇ½Ç);
	}
	
	public void Ã»¼Ò() {
		for(Ã»¼ÒÇÏ±â ÆÀ¿ø : ÆÀ¿øµé) {
			ÆÀ¿ø.Ã»¼Ò();
		}
	}
	
	public boolean Ã»¼Ò¿Ï·á() {
		return true;
	}
	
	public void È¸ÀÇ½ÇÀÌµ¿(String È¸ÀÇ½Ç) {
		for (Ã»¼ÒÇÏ±â ÆÀ¿ø : ÆÀ¿øµé) {
			ÆÀ¿ø.È¸ÀÇ½ÇÀÌµ¿(È¸ÀÇ½Ç);
		}
	}
}
