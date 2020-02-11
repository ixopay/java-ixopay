package com.ixopay.client.model;

/** XSD schema root elements */
final class GatewayModelTypes {
	private GatewayModelTypes(){}

	public static final Class[] classes = {
		com.ixopay.client.model.callback.CallbackType.class,
		com.ixopay.client.model.callback.ErrorType.class,
		com.ixopay.client.model.options.OptionsType.class,
		com.ixopay.client.model.result.ErrorType.class,
		com.ixopay.client.model.result.ResultType.class,
		com.ixopay.client.model.schedule.ScheduleRequestType.class,
		com.ixopay.client.model.schedule.ScheduleResultType.class,
		com.ixopay.client.model.status_result.StatusResultType.class,
		com.ixopay.client.model.status.StatusType.class,
		com.ixopay.client.model.transaction.TransactionType.class
	};

}
