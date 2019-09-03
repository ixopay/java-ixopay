
package com.ixopay.client.model.transaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ixopay.client.model.transaction package. 
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

    private final static QName _Transaction_QNAME = new QName("http://gateway.ixopay.com/Schema/V2/Transaction", "transaction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ixopay.client.model.transaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransactionType }
     * 
     */
    public TransactionType createTransactionType() {
        return new TransactionType();
    }

    /**
     * Create an instance of {@link ExtraDataType }
     * 
     */
    public ExtraDataType createExtraDataType() {
        return new ExtraDataType();
    }

    /**
     * Create an instance of {@link ScheduleType }
     * 
     */
    public ScheduleType createScheduleType() {
        return new ScheduleType();
    }

    /**
     * Create an instance of {@link AddToCustomerProfileType }
     * 
     */
    public AddToCustomerProfileType createAddToCustomerProfileType() {
        return new AddToCustomerProfileType();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link CreditCardCustomerType }
     * 
     */
    public CreditCardCustomerType createCreditCardCustomerType() {
        return new CreditCardCustomerType();
    }

    /**
     * Create an instance of {@link IbanCustomerType }
     * 
     */
    public IbanCustomerType createIbanCustomerType() {
        return new IbanCustomerType();
    }

    /**
     * Create an instance of {@link BaseTransactionType }
     * 
     */
    public BaseTransactionType createBaseTransactionType() {
        return new BaseTransactionType();
    }

    /**
     * Create an instance of {@link BaseTransactionWithReferenceType }
     * 
     */
    public BaseTransactionWithReferenceType createBaseTransactionWithReferenceType() {
        return new BaseTransactionWithReferenceType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link ItemsType }
     * 
     */
    public ItemsType createItemsType() {
        return new ItemsType();
    }

    /**
     * Create an instance of {@link DebitType }
     * 
     */
    public DebitType createDebitType() {
        return new DebitType();
    }

    /**
     * Create an instance of {@link PreauthorizeType }
     * 
     */
    public PreauthorizeType createPreauthorizeType() {
        return new PreauthorizeType();
    }

    /**
     * Create an instance of {@link RegisterType }
     * 
     */
    public RegisterType createRegisterType() {
        return new RegisterType();
    }

    /**
     * Create an instance of {@link CaptureType }
     * 
     */
    public CaptureType createCaptureType() {
        return new CaptureType();
    }

    /**
     * Create an instance of {@link VoidType }
     * 
     */
    public VoidType createVoidType() {
        return new VoidType();
    }

    /**
     * Create an instance of {@link RefundType }
     * 
     */
    public RefundType createRefundType() {
        return new RefundType();
    }

    /**
     * Create an instance of {@link DeregisterType }
     * 
     */
    public DeregisterType createDeregisterType() {
        return new DeregisterType();
    }

    /**
     * Create an instance of {@link PayoutType }
     * 
     */
    public PayoutType createPayoutType() {
        return new PayoutType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransactionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://gateway.ixopay.com/Schema/V2/Transaction", name = "transaction")
    public JAXBElement<TransactionType> createTransaction(TransactionType value) {
        return new JAXBElement<TransactionType>(_Transaction_QNAME, TransactionType.class, null, value);
    }

}
