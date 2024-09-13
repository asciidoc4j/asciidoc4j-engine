/*
 * Copyright (C) 2024-present, Arpan Mukhopadhyay. All rights reserved.
 * DO NOT REMOVE OR MODIFY THIS COPYRIGHT NOTICE OR THIS FILE HEADER.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.asciidoc4j.core;

import java.util.Set;

/**
 * 
 * @author Arpan Mukhopadhyay
 */
public interface Context {

	/**
	 * 
	 * @param <V>
	 * @param key
	 * @param value
	 */
	<V> void put(final String key, V value);

	/**
	 * 
	 * @param <V>
	 * @param key
	 * @return
	 */
	<V> V get(final String key);

	/**
	 * 
	 * @param key
	 * @return
	 */
	boolean containsKey(final String key);

	/**
	 * 
	 * @param key
	 */
	void remove(final String key);

	/**
	 * 
	 * @return
	 */
	Set<String> keys();
}
