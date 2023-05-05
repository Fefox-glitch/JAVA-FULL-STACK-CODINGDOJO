package com.fernando.telefonos.Test;

import com.fernando.telefonos.main.Galaxy;
import com.fernando.telefonos.main.IPhone;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		IPhone iPhoneX = new IPhone("X", 100, "AT&T", "Zing!");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iPhoneX.displayInfo();
		System.out.println(iPhoneX.ring());
		System.out.println(iPhoneX.unlock());
	}

}