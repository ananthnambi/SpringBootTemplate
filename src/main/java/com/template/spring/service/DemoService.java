package com.template.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.template.spring.model.json.Request;
import com.template.spring.model.json.Response;
import com.template.spring.model.mongo.Demo;
import com.template.spring.repository.mongo.DemoRepository;

@Service
public class DemoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoService.class);

	@Autowired
	private DemoRepository demoRepository;

	public Response process(Request request) {

		Response response = null;

		try {

			if (request != null && request.getId() != null) {

				Demo demo = demoRepository.findOneByAppNo(Integer.parseInt(request.getId()));

				if (demo != null) {

					response = new Response();
					response.setAppName(demo.getAppName());
					response.setId(Integer.toString(demo.getAppNo()));

				}

			}

		} catch (Exception ex) {

			LOGGER.error("Exception in process", ex);

		}

		return response;

	}

}