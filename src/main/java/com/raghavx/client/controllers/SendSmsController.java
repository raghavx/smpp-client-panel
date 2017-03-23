package com.raghavx.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.raghavx.client.services.SendSmsService;

@RestController
public class SendSmsController {

	@Autowired
	private SendSmsService sendSmsService;
	public void send(){
		sendSmsService.send();
	}
}
