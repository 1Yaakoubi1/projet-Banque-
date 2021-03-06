
package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceBanqueService", targetNamespace = "http://serviceBanque/", wsdlLocation = "http://localhost:8585/?wsdl")
public class ServiceBanqueService
    extends Service
{

    private final static URL SERVICEBANQUESERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEBANQUESERVICE_EXCEPTION;
    private final static QName SERVICEBANQUESERVICE_QNAME = new QName("http://serviceBanque/", "ServiceBanqueService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8585/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEBANQUESERVICE_WSDL_LOCATION = url;
        SERVICEBANQUESERVICE_EXCEPTION = e;
    }

    public ServiceBanqueService() {
        super(__getWsdlLocation(), SERVICEBANQUESERVICE_QNAME);
    }

    public ServiceBanqueService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEBANQUESERVICE_QNAME, features);
    }

    public ServiceBanqueService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEBANQUESERVICE_QNAME);
    }

    public ServiceBanqueService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEBANQUESERVICE_QNAME, features);
    }

    public ServiceBanqueService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceBanqueService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueWS
     */
    @WebEndpoint(name = "BanqueWSPort")
    public BanqueWS getBanqueWSPort() {
        return super.getPort(new QName("http://serviceBanque/", "BanqueWSPort"), BanqueWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueWS
     */
    @WebEndpoint(name = "BanqueWSPort")
    public BanqueWS getBanqueWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceBanque/", "BanqueWSPort"), BanqueWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEBANQUESERVICE_EXCEPTION!= null) {
            throw SERVICEBANQUESERVICE_EXCEPTION;
        }
        return SERVICEBANQUESERVICE_WSDL_LOCATION;
    }

}
