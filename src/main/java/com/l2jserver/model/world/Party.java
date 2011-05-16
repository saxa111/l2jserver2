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
package com.l2jserver.model.world;

import java.util.Iterator;
import java.util.List;

import com.l2jserver.model.id.object.CharacterID;
import com.l2jserver.model.id.object.ClanID;
import com.l2jserver.model.id.object.iterator.WorldObjectIterator;
import com.l2jserver.model.world.capability.Joinable;
import com.l2jserver.model.world.capability.Listenable;
import com.l2jserver.model.world.party.PartyEvent;
import com.l2jserver.model.world.party.PartyListener;
import com.l2jserver.util.factory.CollectionFactory;

/**
 * This class represents an Party in Lineage II world
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class Party extends AbstractObject implements
		Listenable<PartyListener, PartyEvent>, Joinable<L2Character> {
	/**
	 * Active party members
	 */
	private final List<CharacterID> members = CollectionFactory
			.newList(CharacterID.class);

	@Override
	public void join(L2Character member) {
		members.add(member.getID());
	}

	@Override
	public ClanID getID() {
		return (ClanID) super.getID();
	}

	@Override
	public void leave(L2Character member) {

	}

	@Override
	public Iterator<L2Character> iterator() {
		return new WorldObjectIterator<L2Character>(members.iterator());
	}
}