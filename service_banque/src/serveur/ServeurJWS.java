package serveur;

import javax.xml.ws.Endpoint;

import serviceBanque.ServiceBanque;

public class ServeurJWS {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		{String url="http://localhost:8581/";
		Endpoint.publish(url, new ServiceBanque());
		System.out.print(url);
		}
	}

}
