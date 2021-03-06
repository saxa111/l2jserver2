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
package com.l2jserver.game.net.packet.server;

import org.jboss.netty.buffer.ChannelBuffer;

import com.l2jserver.model.world.Actor;
import com.l2jserver.model.world.L2Character;
import com.l2jserver.service.game.chat.ChatMessageType;
import com.l2jserver.service.network.model.Lineage2Client;
import com.l2jserver.service.network.model.packet.AbstractServerPacket;
import com.l2jserver.util.BufferUtils;

/**
 * This packet notifies the client that the chosen character has been
 * successfully selected.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class SM_ACTOR_CHAT extends AbstractServerPacket {
	/**
	 * The packet OPCODE
	 */
	public static final int OPCODE = 0x4a;

	/**
	 * The sending actor
	 */
	private final Actor actor;
	/**
	 * The message destination
	 */
	private ChatMessageType destination;
	/**
	 * The message
	 */
	private String message = null;
	/**
	 * The message ID
	 */
	private int messageID = 0;

	/**
	 * @param character
	 *            the actor
	 * @param destination
	 *            the destination
	 * @param message
	 *            the message
	 */
	public SM_ACTOR_CHAT(Actor character, ChatMessageType destination,
			String message) {
		super(OPCODE);
		this.actor = character;
		this.destination = destination;
		this.message = message;
	}

	/**
	 * @param actor
	 *            the actor
	 * @param destination
	 *            the destination
	 * @param messageID
	 *            the message id
	 */
	public SM_ACTOR_CHAT(Actor actor, ChatMessageType destination, int messageID) {
		super(OPCODE);
		this.actor = actor;
		this.destination = destination;
		this.messageID = messageID;
	}

	@Override
	public void write(Lineage2Client conn, ChannelBuffer buffer) {
		buffer.writeInt(actor.getID().getID());
		buffer.writeInt(destination.id);
		if (actor instanceof L2Character) {
			BufferUtils.writeString(buffer, ((L2Character) actor).getName());
		} else {
			buffer.writeInt(actor.getID().getID());
		}
		if (message != null) {
			BufferUtils.writeString(buffer, message);
		} else {
			buffer.writeInt(messageID);
		}
	}
}
