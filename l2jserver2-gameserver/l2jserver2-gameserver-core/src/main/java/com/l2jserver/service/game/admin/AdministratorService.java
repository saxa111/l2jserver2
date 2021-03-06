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
package com.l2jserver.service.game.admin;

import com.l2jserver.model.world.L2Character;
import com.l2jserver.service.Service;
import com.l2jserver.service.ServiceException;
import com.l2jserver.service.network.model.Lineage2Client;

/**
 * This service handles administrators in the server
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public interface AdministratorService extends Service {
	/**
	 * Executes an command
	 * 
	 * @param conn
	 *            the lineage 2 connection
	 * @param character
	 *            the admin character
	 * @param command
	 *            the command
	 * @param args
	 *            the arguments
	 * @throws ServiceException
	 *             if any service exception occur
	 */
	void command(Lineage2Client conn, L2Character character, String command,
			String... args) throws ServiceException;

	/**
	 * The base interface for Administrator commands
	 * 
	 * @author <a href="http://www.rogiel.com">Rogiel</a>
	 */
	public interface AdministratorCommand {
		/**
		 * @param character
		 *            the administrator character
		 * @param args
		 *            the arguments
		 */
		void administrator(L2Character character, String... args);
	}
}
