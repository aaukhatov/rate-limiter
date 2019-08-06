/*
 * Copyright (C) 2019 Arthur Aukhatov
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package art.aukhatov.ratelimiter.api;

import art.aukhatov.ratelimiter.model.Hello;
import art.aukhatov.ratelimiter.service.SlowServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GatewayController {

	private final SlowServiceClient slowServiceClient;

	@Autowired
	public GatewayController(SlowServiceClient slowServiceClient) {
		this.slowServiceClient = slowServiceClient;
	}

	@GetMapping(path = "/messages",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Hello getMessage() {
		return slowServiceClient.getMessage();
	}
}
