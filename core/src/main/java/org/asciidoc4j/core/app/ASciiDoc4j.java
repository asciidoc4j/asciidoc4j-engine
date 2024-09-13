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

package org.asciidoc4j.core.app;

import java.io.Reader;
import java.io.Writer;

import org.asciidoc4j.core.runtime.Engine;

/**
 * 
 * @author Arpan Mukhopadhyay
 */
public final class ASciiDoc4j {

	/**
	 * 
	 */
	private ASciiDoc4j() {
	}

	public static void init() {
		Engine engine = Engine.getInstance();

	}

	/**
	 * 
	 * @param w
	 * @param template
	 * @return
	 */
	public static boolean evaluate(Writer w, final String template) {
		return false;
	}

	/**
	 * 
	 * @param w
	 * @param r
	 * @return
	 */
	public static boolean evaluate(Writer w, Reader r) {
		return false;
	}
}
