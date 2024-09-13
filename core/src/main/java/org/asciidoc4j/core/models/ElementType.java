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

package org.asciidoc4j.core.models;

/**
 * 
 * @author Arpan Mukhopadhyay
 */
public enum ElementType {

	TOC, AUTHOR, DATE, DATETIME, PARAGRAPH, FMT_NONE, FMT_BOLD, FMT_ITALIC, FMT_UNDERLINE, LINK, HEADER, INCLUDE, LIST, TABLE,
	BLOCK, BLOCK_TITLE, IMAGE, AUDIO, VIDEO, KBD_MACRO, BTN_MACRO, MENU_MACRO, LITERAL, SOURCE_CODE, ADMONITION, QUOTE, COMMENT, ATTRIBUTE, FOOT_NOTE;
}
