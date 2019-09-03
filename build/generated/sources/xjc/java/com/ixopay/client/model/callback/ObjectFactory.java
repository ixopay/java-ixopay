
package com.ixopay.client.model.callback;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ixopay.client.model.callback package. 
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

    private final static QName _Callback_QNAME = new QName("http://gateway.ixopay.com/Schema/V2/Callback", "callback");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ixopay.client.model.callback
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CallbackType }
     * 
     */
    public CallbackType createCallbackType() {
        return new CallbackType();
    }

    /**
     * Create an instance of {@link ExtraDataType }
     * 
     */
    public ExtraDataType createExtraDataType() {
        return new ExtraDataType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ChargebackDataType }
     * 
     */
    public ChargebackDataType createChargebackDataType() {
        return new ChargebackDataType();
    }

    /**
     * Create an instance of {@link ChargebackReversalDataType }
     * 
     */
    public ChargebackReversalDataType createChargebackReversalDataType() {
        return new ChargebackReversalDataType();
    }

    /**
     * Create an instance of {@link CustomerProfileDataType }
     * 
     */
    public CustomerProfileDataType createCustomerProfileDataType() {
        return new CustomerProfileDataType();
    }

    /**
     * Create an instance of {@link ReturnDataType }
     * 
     */
    public ReturnDataType createReturnDataType() {
        return new ReturnDataType();
    }

    /**
     * Create an instance of {@link CreditcardDataType }
     * 
     */
    public CreditcardDataType createCreditcardDataType() {
        return new CreditcardDataType();
    }

    /**
     * Create an instance of {@link PhoneDataType }
     * 
     */
    public PhoneDataType createPhoneDataType() {
        return new PhoneDataType();
    }

    /**
     * Create an instance of {@link IbanDataType }
     * 
     */
    public IbanDataType createIbanDataType() {
        return new IbanDataType();
    }

    /**
     * Create an instance of {@link WalletDataType }
     * 
     */
    public WalletDataType createWalletDataType() {
        return new WalletDataType();
    }

    /**
     * Create an instance of {@link CustomerDataType }
     * 
     */
    public CustomerDataType createCustomerDataType() {
        return new CustomerDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallbackType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallbackType }{@code >}
     */
    @XmlElementDecl(namespace = "http://gateway.ixopay.com/Schema/V2/Callback", name = "callback")
    public JAXBElement<CallbackType> createCallback(CallbackType value) {
        return new JAXBElement<CallbackType>(_Callback_QNAME, CallbackType.class, null, value);
    }

}
