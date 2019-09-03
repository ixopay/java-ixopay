
package com.ixopay.client.model.options;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ixopay.client.model.options package. 
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

    private final static QName _Options_QNAME = new QName("http://gateway.ixopay.com/Schema/V2/Options", "options");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ixopay.client.model.options
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OptionsType }
     * 
     */
    public OptionsType createOptionsType() {
        return new OptionsType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OptionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://gateway.ixopay.com/Schema/V2/Options", name = "options")
    public JAXBElement<OptionsType> createOptions(OptionsType value) {
        return new JAXBElement<OptionsType>(_Options_QNAME, OptionsType.class, null, value);
    }

}
