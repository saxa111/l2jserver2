/*
 * This file is part of l2jserver <l2jserver.com>.
 *
 * l2jserver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.model.id.object.factory;

import com.l2jserver.model.id.ObjectID;
import com.l2jserver.model.id.factory.IDFactory;

public interface ObjectIDFactory<T extends ObjectID<?>> extends
		IDFactory<Integer, T> {
	/**
	 * Generates a new ID
	 * 
	 * @return the new ID
	 */
	T createID();

	/**
	 * Destroy this ID. Releases this value to be used once again.
	 * 
	 * @param id
	 *            the id to be destroyed.
	 */
	void destroy(T id);
}
