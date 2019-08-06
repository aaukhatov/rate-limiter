/*
 * Copyright (C) 2019 Arthur Aukhatov
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package art.aukhatov.ratelimiter.model;

public class Hello {

	private String message;

	public String getMessage() {
		return message;
	}

	public Hello setMessage(String message) {
		this.message = message;
		return this;
	}

	@Override
	public String toString() {
		return "Hello{" +
				"message='" + message + '\'' +
				'}';
	}
}
