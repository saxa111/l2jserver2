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
package com.l2jserver.service.game;

import com.l2jserver.service.Service;

/**
 * This service is responsible for managing the time in-game world.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public interface GameTimeService extends Service {
	/**
	 * The real time length of a day in-game in milliseconds.
	 */
	public static final int GAME_DAY = 120 * 60 * 1000;

	/**
	 * Returns the in-game time
	 * 
	 * @return the game time
	 */
	int getGameTime();
}
