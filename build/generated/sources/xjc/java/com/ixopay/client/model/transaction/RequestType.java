
package com.ixopay.client.model.transaction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getParam" type="{http://gateway.ixopay.com/Schema/V2/Transaction}extraDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="postParam" type="{http://gateway.ixopay.com/Schema/V2/Transaction}extraDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requestHeader" type="{http://gateway.ixopay.com/Schema/V2/Transaction}extraDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requestBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestType", propOrder = {
    "getParam",
    "postParam",
    "requestHeader",
    "requestBody"
})
public class RequestType {

    protected List<ExtraDataType> getParam;
    protected List<ExtraDataType> postParam;
    protected List<ExtraDataType> requestHeader;
    protected String requestBody;

    /**
     * Default no-arg constructor
     * 
     */
    public RequestType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RequestType(final List<ExtraDataType> getParam, final List<ExtraDataType> postParam, final List<ExtraDataType> requestHeader, final String requestBody) {
        this.getParam = getParam;
        this.postParam = postParam;
        this.requestHeader = requestHeader;
        this.requestBody = requestBody;
    }

    /**
     * Gets the value of the getParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraDataType }
     * 
     * 
     */
    public List<ExtraDataType> getGetParam() {
        if (getParam == null) {
            getParam = new ArrayList<ExtraDataType>();
        }
        return this.getParam;
    }

    /**
     * Gets the value of the postParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraDataType }
     * 
     * 
     */
    public List<ExtraDataType> getPostParam() {
        if (postParam == null) {
            postParam = new ArrayList<ExtraDataType>();
        }
        return this.postParam;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraDataType }
     * 
     * 
     */
    public List<ExtraDataType> getRequestHeader() {
        if (requestHeader == null) {
            requestHeader = new ArrayList<ExtraDataType>();
        }
        return this.requestHeader;
    }

    /**
     * Gets the value of the requestBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestBody() {
        return requestBody;
    }

    /**
     * Sets the value of the requestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestBody(String value) {
        this.requestBody = value;
    }

}
