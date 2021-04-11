package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		// Order brazilian IPhone11
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhone11Factory factory = new IPhone11Factory(rules);
		IPhone iPhone = factory.orderIPhone("standard");


	}
}
