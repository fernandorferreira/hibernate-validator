/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.test.internal.engine.valuehandling.model;

import javax.validation.constraints.NotNull;

/**
 * @author Guillaume Smet
 */
public class Entity1 {

	@SuppressWarnings("unused")
	private Wrapper1<@NotNull String> wrapper;

	public Entity1(String value) {
		this.wrapper = new Wrapper1<String>( value );
	}
}
