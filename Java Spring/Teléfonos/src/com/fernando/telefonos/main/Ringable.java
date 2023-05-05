package com.fernando.telefonos.main;

public interface Ringable {

	public default String ring() {
		return "Brr Brr Brr!";
	}
	public default String unlock() {
		return "Tap para desbloquear!";
	}
	
	
	
}