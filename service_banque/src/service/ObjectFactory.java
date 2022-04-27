
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetComptesResponse_QNAME = new QName("http://serviceBanque/", "getComptesResponse");
    private final static QName _Compte_QNAME = new QName("http://serviceBanque/", "compte");
    private final static QName _GetComptes_QNAME = new QName("http://serviceBanque/", "getComptes");
    private final static QName _ToStringResponse_QNAME = new QName("http://serviceBanque/", "toStringResponse");
    private final static QName _ToString_QNAME = new QName("http://serviceBanque/", "toString");
    private final static QName _ConversionEuroDinarsResponse_QNAME = new QName("http://serviceBanque/", "conversionEuroDinarsResponse");
    private final static QName _GetCompteResponse_QNAME = new QName("http://serviceBanque/", "getCompteResponse");
    private final static QName _GetCompte_QNAME = new QName("http://serviceBanque/", "getCompte");
    private final static QName _ConversionEuroDinars_QNAME = new QName("http://serviceBanque/", "conversionEuroDinars");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroDinars }
     * 
     */
    public ConversionEuroDinars createConversionEuroDinars() {
        return new ConversionEuroDinars();
    }

    /**
     * Create an instance of {@link ConversionEuroDinarsResponse }
     * 
     */
    public ConversionEuroDinarsResponse createConversionEuroDinarsResponse() {
        return new ConversionEuroDinarsResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link ToStringResponse }
     * 
     */
    public ToStringResponse createToStringResponse() {
        return new ToStringResponse();
    }

    /**
     * Create an instance of {@link ToString }
     * 
     */
    public ToString createToString() {
        return new ToString();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceBanque/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceBanque/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceBanque/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceBanque/", name = "toStringResponse")
    public JAXBElement<ToStringResponse> createToStringResponse(ToStringResponse value) {
        return new JAXBElement<ToStringResponse>(_ToStringResponse_QNAME, ToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceBanque/", name = "toString")
    public JAXBElement<ToString> createToString(ToString value) {
        return new JAXBElement<ToString>(_ToString_QNAME, ToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroDinarsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceBanque/", name = "conversionEuroDinarsResponse")
    public JAXBElement<ConversionEuroDinarsResponse> createConversionEuroDinarsResponse(ConversionEuroDinarsResponse value) {
        return new JAXBElement<ConversionEuroDinarsResponse>(_ConversionEuroDinarsResponse_QNAME, ConversionEuroDinarsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceBanque/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceBanque/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroDinars }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceBanque/", name = "conversionEuroDinars")
    public JAXBElement<ConversionEuroDinars> createConversionEuroDinars(ConversionEuroDinars value) {
        return new JAXBElement<ConversionEuroDinars>(_ConversionEuroDinars_QNAME, ConversionEuroDinars.class, null, value);
    }

}
