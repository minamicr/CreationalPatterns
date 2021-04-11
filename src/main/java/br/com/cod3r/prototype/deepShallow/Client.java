package br.com.cod3r.prototype.deepShallow;

import br.com.cod3r.prototype.deepShallow.model.Address;
import br.com.cod3r.prototype.deepShallow.model.City;
import br.com.cod3r.prototype.deepShallow.model.UF;
import br.com.cod3r.prototype.deepShallow.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("Clone", 25, new Address("ABC Street", 1000
			, new City("São Paulo", UF.SP)));
		System.out.println(user);
		
		User cloneUser = user.clone();
		cloneUser.name = "Clone x2";
		cloneUser.address.street = "Double Street";
		cloneUser.address.city.city = "Rio de Janeiro";
		cloneUser.address.city.uf = UF.MG;
		System.out.println(user);
		System.out.println(cloneUser);
	}
}
