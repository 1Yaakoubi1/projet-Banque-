package serviceBanque;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

@WebService(name = "BanqueWS")

public class ServiceBanque {
	
@WebMethod(operationName = "conversionEuroDinars")
public double convertir(@WebParam(name="montant")double mt)
{ return mt*3.3;
}

@WebMethod
public Compte getCompte(long code)
{ return new Compte(code,Math.random()*2000,new Date());
}

@WebMethod
public List<Compte> getComptes()
{List<Compte> lstcomptes=new ArrayList<Compte>();
lstcomptes.add(new Compte(1L,Math.random()*2000,new Date()));
lstcomptes.add(new Compte(2L,Math.random()*3000,new Date()));
lstcomptes.add(new Compte(3L,Math.random()*2000,new Date()));
return lstcomptes;
}

@Override
public String toString() {
	return "ServiceBanque [getComptes()=" + getComptes() + "]";
}

}


