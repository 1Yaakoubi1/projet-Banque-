package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BanqueWS stub = new ServiceBanqueService().getBanqueWSPort();
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Entrer montant a convertir en Euro:");
				double montant = sc.nextDouble();
				double res = stub.conversionEuroDinars(montant);
				
				System.out.println(res);
			}
			List<Compte> lst = new ArrayList<Compte>();
			lst = stub.getComptes();
			Compte x = new Compte();
			x = stub.getCompte(2);
			System.out.println("compte 2 : "+x.getSolde());
					
			for(Compte c:lst) {
				System.out.println("Compte "+c.getCode()+" :  "+c.getSolde());
			}
			
	}

}
