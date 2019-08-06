/*
 * Copyright (C) 2019 Arthur Aukhatov
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package art.aukhatov.ratelimiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RateLimiterGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateLimiterGatewayApplication.class, args);
	}

}
