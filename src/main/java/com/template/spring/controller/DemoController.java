package com.template.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.template.spring.model.json.Request;
import com.template.spring.model.json.Response;
import com.template.spring.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(value="/getResponse", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Response getResponse(@RequestBody Request request) {

		return demoService.process(request);

	}

}