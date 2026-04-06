package com.plm;

public class mainPC {
	public static void main(String args[]) {
		Child c = new Child();
		c.bankName("Sbi");
		c.details("Ankita", 05, "Solapur");
		
		Parent p = new Parent();
		p.details("Prabhakar", 02, "Solapur");
		p.bankName("Rbi");
	}

}
