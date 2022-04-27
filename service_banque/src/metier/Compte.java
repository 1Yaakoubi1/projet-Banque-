package metier;

import java.util.Date;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
public class Compte {

private long code;
private double solde;
@XmlTransient
private Date datecreaation;

public long getCode() {
return code;
}
public void setCode(long code) {
this.code = code;
}
public double getSolde() {
return solde;
}
public void setSolde(double solde) {
this.solde = solde;
}
public Date getDatecreaation() {
return datecreaation;
}
public void setDatecreaation(Date datecreaation) {
this.datecreaation = datecreaation;
}

public Compte(long code, double solde, Date datecreaation) {
super();
this.code = code;
this.solde = solde;
this.datecreaation = datecreaation;
}
public Compte() {
super();
}
	

}
