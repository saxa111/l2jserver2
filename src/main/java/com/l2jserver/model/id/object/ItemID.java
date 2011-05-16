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
package com.l2jserver.model.id.object;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.l2jserver.db.dao.ItemDAO;
import com.l2jserver.model.id.ObjectID;
import com.l2jserver.model.world.Item;

/**
 * An {@link ObjectID} instance representing an {@link Item} object
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public final class ItemID extends ObjectID<Item> {
	/**
	 * Data Access Object (DAO) for items
	 */
	private final ItemDAO itemDao;

	@Inject
	protected ItemID(@Assisted int id, ItemDAO itemDao) {
		super(id);
		this.itemDao = itemDao;
	}

	@Override
	public Item getObject() {
		return itemDao.load(this);
	}
}