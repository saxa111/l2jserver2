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
package com.l2jserver.tool;

import com.l2jserver.model.world.character.CharacterClass;

public class CharacterSQLEnumGenerator {
	public static void main(String[] args) {
		System.out.println("== 'Character' SQL STATEMENT ==");
		System.out.println(createClassStatement());
	}

	private static String createClassStatement() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ALTER TABLE `character` CHANGE `class` `class` ENUM(");
		for (CharacterClass c : CharacterClass.values()) {
			if (!c.name().startsWith("DUMMY"))
				builder.append("'" + c.name() + "',");
		}
		builder.replace(builder.length() - 1, builder.length(), "");
		builder.append(") CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT 'HUMAN_FIGHTER';");
		return builder.toString();
	}
}
