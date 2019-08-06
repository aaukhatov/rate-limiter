/*
 * Copyright (C) 2019 Arthur Aukhatov
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package art.aukhatov.ratelimiter.service;

import art.aukhatov.ratelimiter.model.Hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SlowServiceClient {

	private static final Logger logger = LoggerFactory.getLogger(SlowServiceClient.class);
	private final RestTemplate restTemplate;
	private final String endpoint;

	@Autowired
	public SlowServiceClient(RestTemplate restTemplate,
							 @Value("${slow-limited-service.endpoint}") String endpoint) {
		this.restTemplate = restTemplate;
		this.endpoint = endpoint;
	}

	public Hello getMessage() {
		logger.info("Get a message by RestTemplate");
		return restTemplate
				.getForEntity(endpoint + "/messages", Hello.class)
				.getBody();
	}
}
