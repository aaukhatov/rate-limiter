/*
 * Copyright (C) 2019 Arthur Aukhatov
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package art.aukhatov.slowlimited.model;

public class Hello {

	private final String message;

	public Hello(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Hello{" +
				"message='" + message + '\'' +
				'}';
	}
}
