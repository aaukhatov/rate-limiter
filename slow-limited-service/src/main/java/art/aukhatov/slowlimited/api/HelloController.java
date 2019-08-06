/*
 * Copyright (C) 2019 Arthur Aukhatov
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package art.aukhatov.slowlimited.api;

import art.aukhatov.slowlimited.model.Hello;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

	@GetMapping(path = "/messages",
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Hello makeStaticMessage() {
		return new Hello("Hello World!");
	}
}
