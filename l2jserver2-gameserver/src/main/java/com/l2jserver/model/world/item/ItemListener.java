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
package com.l2jserver.model.world.item;

import com.l2jserver.service.game.world.event.TypedWorldListener;

/**
 * This listener will filter to only dispatch {@link ItemEvent} events.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public abstract class ItemListener extends TypedWorldListener<ItemEvent> {
	/**
	 * Creates a new instance
	 */
	public ItemListener() {
		super(ItemEvent.class);
	}
}