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
package com.l2jserver.game.net.packet.client;

import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;

import com.google.inject.Inject;
import com.l2jserver.game.net.packet.server.SM_CHAR_SELECTED;
import com.l2jserver.model.dao.CharacterDAO;
import com.l2jserver.model.world.L2Character;
import com.l2jserver.service.network.model.Lineage2Client;
import com.l2jserver.service.network.model.packet.AbstractClientPacket;

/**
 * This packet notifies the server which character the player has chosen to use.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class CM_CHAR_SELECT extends AbstractClientPacket {
	/**
	 * The packet OPCODE
	 */
	public static final int OPCODE = 0x0d;

	/**
	 * The {@link CharacterDAO} implementation
	 */
	private final CharacterDAO characterDao;

	// packet
	/**
	 * The character slot
	 */
	private int slot;

	/**
	 * @param characterDao
	 *            the character dao
	 */
	@Inject
	public CM_CHAR_SELECT(CharacterDAO characterDao) {
		this.characterDao = characterDao;
	}

	@Override
	public void read(Lineage2Client conn, ChannelBuffer buffer) {
		slot = buffer.readInt();
	}

	@Override
	public void process(final Lineage2Client conn) {
		final List<L2Character> chars = characterDao.selectByAccount(conn
				.getSession().getAccountID());

		// FIXME better handling! this will throw an exception sooner or later
		final L2Character character = chars.get(slot);
		conn.setCharacterID(character.getID());

		conn.write(new SM_CHAR_SELECTED(chars.get(slot)));
	}
}
