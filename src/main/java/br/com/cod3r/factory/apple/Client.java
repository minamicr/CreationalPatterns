package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory factory = new IPhoneFactory();
		System.out.println("### Ordering an iPhone X");
		factory.orderPhone("IPhoneX", "");
		
		System.out.println("\n\n### Ordering an iPhone 11 Pro");
		factory.orderPhone("IPhone11", "Pro");
	}
}
