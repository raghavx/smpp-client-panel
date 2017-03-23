package com.raghavx.client.controllers;

import org.slf4j.Logger;

import com.cloudhopper.smpp.impl.DefaultSmppSessionHandler;
import com.cloudhopper.smpp.pdu.PduRequest;
import com.cloudhopper.smpp.pdu.PduResponse;

public class ClientSmppSessionHandler extends DefaultSmppSessionHandler {
	private static Logger logger;

	public ClientSmppSessionHandler() {
		super(logger );
	}

	@Override
	public void firePduRequestExpired(PduRequest pduRequest) {
		logger.warn("PDU request expired: {}", pduRequest);
	}

	@Override
	public PduResponse firePduRequestReceived(PduRequest pduRequest) {
		PduResponse response = pduRequest.createResponse();

		// do any logic here

		return response;
	}
}
