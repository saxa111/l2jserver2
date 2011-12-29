/*
 * This file is part of l2jserver2 <l2jserver2.com>.
 *
 * l2jserver2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver2.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.util.transformer.impl;

import com.l2jserver.util.transformer.Transformer;

/**
 * This tranformer does nothing!
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class StringTransformer implements Transformer<String> {
	/**
	 * This transformer shared instance
	 */
	public static final StringTransformer SHARED_INSTANCE = new StringTransformer();

	@Override
	public String transform(Class<? extends String> type, String value) {
		return value;
	}

	@Override
	public String untransform(Class<? extends String> type, String value) {
		return value;
	}

}