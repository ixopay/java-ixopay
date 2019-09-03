
package com.ixopay.client.model.schedule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ixopay.client.model.schedule package. 
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

    private final static QName _Schedule_QNAME = new QName("http://gateway.ixopay.com/Schema/V2/Schedule", "schedule");
    private final static QName _ScheduleResult_QNAME = new QName("http://gateway.ixopay.com/Schema/V2/ScheduleResult", "scheduleResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ixopay.client.model.schedule
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScheduleRequestType }
     * 
     */
    public ScheduleRequestType createScheduleRequestType() {
        return new ScheduleRequestType();
    }

    /**
     * Create an instance of {@link StartScheduleType }
     * 
     */
    public StartScheduleType createStartScheduleType() {
        return new StartScheduleType();
    }

    /**
     * Create an instance of {@link ShowScheduleType }
     * 
     */
    public ShowScheduleType createShowScheduleType() {
        return new ShowScheduleType();
    }

    /**
     * Create an instance of {@link PauseScheduleType }
     * 
     */
    public PauseScheduleType createPauseScheduleType() {
        return new PauseScheduleType();
    }

    /**
     * Create an instance of {@link CancelScheduleType }
     * 
     */
    public CancelScheduleType createCancelScheduleType() {
        return new CancelScheduleType();
    }

    /**
     * Create an instance of {@link ContinueScheduleType }
     * 
     */
    public ContinueScheduleType createContinueScheduleType() {
        return new ContinueScheduleType();
    }

    /**
     * Create an instance of {@link ScheduleResultType }
     * 
     */
    public ScheduleResultType createScheduleResultType() {
        return new ScheduleResultType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScheduleRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://gateway.ixopay.com/Schema/V2/Schedule", name = "schedule")
    public JAXBElement<ScheduleRequestType> createSchedule(ScheduleRequestType value) {
        return new JAXBElement<ScheduleRequestType>(_Schedule_QNAME, ScheduleRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleResultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScheduleResultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://gateway.ixopay.com/Schema/V2/ScheduleResult", name = "scheduleResult")
    public JAXBElement<ScheduleResultType> createScheduleResult(ScheduleResultType value) {
        return new JAXBElement<ScheduleResultType>(_ScheduleResult_QNAME, ScheduleResultType.class, null, value);
    }

}
