package com.raghavx.client.controllers;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.raghavx.client.services.SendSmsService;

/**
 * 
 * @author raghav
 *
 */
@RestController
public class SendSmsController {

	@Autowired
	private SendSmsService sendSmsService;

	public Callable<String> send() {
		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				sendSmsService.send();
				return null;
			}
		};
		return callable;
	}
}
