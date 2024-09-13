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

package org.asciidoc4j.core.runtime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Arpan Mukhopadhyay
 */
public final class Engine {

	private static Engine INSTANCE = null;

	private static final Logger log = LoggerFactory.getLogger(Engine.class);

	/**
	 * 
	 */
	private Engine() {
		init();
	}

	/**
	 * 
	 * @return
	 */
	public static Engine getInstance() {
		if (null == INSTANCE) {
			synchronized (Engine.class) {
				if (null == INSTANCE) {
					INSTANCE = new Engine();
				}
			}
		}
		return INSTANCE;
	}

	private void init() {
		log.trace("==========================================");
		log.trace("              Asciidoc4j Engine          ");
		log.trace("==========================================");
		log.debug("Starting AsciiDoc4j engine...");
		log.debug("AsciiDoc4j engine started successfully.");
	}
}
