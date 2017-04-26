package com.ixopay.client.model;

import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.ixopay.client.model.callback.CallbackType;
import com.ixopay.client.model.options.OptionsType;
import com.ixopay.client.model.result.ResultType;
import com.ixopay.client.model.transaction.TransactionType;

public final class GatewayModelContext {

	// defs

	// lazily create context because JAXB context initialization is expensive and we want to avoid it if it's not used
	// relies on the fact that static inner class is only loaded on first access
	private static final class Holder {
		private static final GatewayModelContext INSTANCE = new GatewayModelContext();
	}

	// deps

	// jaxb context is thread-safe, marshaller and unmarshaller are not
	private final JAXBContext jaxbContext;

	// impl

	/** marshaller to marshall Gateway models */
	public static Marshaller marshaller() {
		Marshaller marshaller;
		try {
			marshaller = instance().jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch( JAXBException e ) {
			throw new RuntimeException("failed to create JAXB marshaller", e);
		}

		return marshaller;
	}

	/** unmarshaller to un-marshall Gateway models */
	public static Unmarshaller unmarshaller() {
		try {
			return instance().jaxbContext.createUnmarshaller();
		} catch( JAXBException e ) {
			throw new RuntimeException("failed to create JAXB unmarshaller", e);
		}
	}

	/** helper to convert {@link LocalDate} to XMLGregorianCalendar */
	public static XMLGregorianCalendar xmlGregorianCalendar(LocalDate date) {
		try {
			return DatatypeFactory.newInstance()
				.newXMLGregorianCalendarDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), DatatypeConstants.FIELD_UNDEFINED);
		} catch( DatatypeConfigurationException e ) {
			throw new RuntimeException("failed to convert date to xml date", e);
		}
	}

	// pimpl

	private static GatewayModelContext instance() { return Holder.INSTANCE; }

	private GatewayModelContext() {
		try {
			// constructing jaxb context is expensive, try to re-use the constructed one when possible
			jaxbContext = JAXBContext.newInstance(
				TransactionType.class,
				CallbackType.class,
				com.ixopay.client.model.callback.ErrorType.class,
				ResultType.class,
				com.ixopay.client.model.result.ErrorType.class,
				OptionsType.class
			);
		} catch( JAXBException e ) {
			throw new RuntimeException(e);
		}
	}

}
