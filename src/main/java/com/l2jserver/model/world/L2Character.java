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

import java.sql.Date;

import com.l2jserver.model.id.AccountID;
import com.l2jserver.model.id.object.CharacterID;
import com.l2jserver.model.id.object.ClanID;
import com.l2jserver.model.id.object.PetID;
import com.l2jserver.model.world.character.CharacterAppearance;
import com.l2jserver.model.world.character.CharacterAttributes;
import com.l2jserver.model.world.character.CharacterBaseAttributes;
import com.l2jserver.model.world.character.CharacterCalculatedAttributes;
import com.l2jserver.model.world.character.CharacterClass;
import com.l2jserver.model.world.character.CharacterFriendList;
import com.l2jserver.model.world.character.CharacterInventory;
import com.l2jserver.model.world.character.CharacterShortcutContainer;

/**
 * This class represents a playable character in Lineage II world.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class L2Character extends Player {
	/**
	 * The account id
	 */
	private AccountID accountID;
	/**
	 * The clan id
	 */
	private ClanID clanID;
	/**
	 * The pet id
	 */
	private PetID petID;
	/**
	 * The character name
	 */
	private String name;
	/**
	 * The class of the character
	 */
	private CharacterClass characterClass;
	/**
	 * The character's status
	 */
	private boolean online;
	/**
	 * Date of character's last access
	 */
	private Date lastAccess;

	/**
	 * This character's inventory
	 */
	private final CharacterInventory inventory = new CharacterInventory(this);
	/**
	 * The appearance of this character
	 */
	private final CharacterAppearance appearance = new CharacterAppearance(this);
	/**
	 * The base attributes of this character
	 */
	private final CharacterBaseAttributes baseAttributes;
	/**
	 * The attributes of this character
	 */
	private final CharacterAttributes attributes;
	/**
	 * The list of friend of this character
	 */
	private final CharacterFriendList friendList = new CharacterFriendList(this);
	/**
	 * The shortcut container of this character
	 */
	private final CharacterShortcutContainer shortcuts = new CharacterShortcutContainer(
			this);

	/**
	 * Creates a new instance
	 * 
	 * @param baseAttributes
	 *            the base attribute for this character
	 */
	public L2Character(CharacterBaseAttributes baseAttributes) {
		this.baseAttributes = baseAttributes;
		this.attributes = new CharacterCalculatedAttributes(this);
	}

	/**
	 * @return the account ID
	 */
	public AccountID getAccountID() {
		return accountID;
	}

	/**
	 * @param accountID
	 *            the account ID to set
	 */
	public void setAccountID(AccountID accountID) {
		this.accountID = accountID;
	}

	/**
	 * @return the clanID
	 */
	public ClanID getClanID() {
		return clanID;
	}

	/**
	 * @return the clan
	 */
	public Clan getClan() {
		if (clanID == null)
			return null;
		return clanID.getObject();
	}

	/**
	 * @param clanID
	 *            the clanID to set
	 */
	public void setClanID(ClanID clanID) {
		this.clanID = clanID;
	}

	/**
	 * @return the petID
	 */
	public PetID getPetID() {
		return petID;
	}

	/**
	 * @return the pet
	 */
	public Pet getPet() {
		if (petID == null)
			return null;
		return petID.getObject();
	}

	/**
	 * @param petID
	 *            the petID to set
	 */
	public void setPetID(PetID petID) {
		this.petID = petID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the characterClass
	 */
	public CharacterClass getCharacterClass() {
		return characterClass;
	}

	/**
	 * @param characterClass
	 *            the characterClass to set
	 */
	public void setCharacterClass(CharacterClass characterClass) {
		this.characterClass = characterClass;
	}

	/**
	 * @return the online
	 */
	public boolean isOnline() {
		return online;
	}

	/**
	 * @param online
	 *            the online to set
	 */
	public void setOnline(boolean online) {
		this.online = online;
	}

	/**
	 * @return the lastAccess
	 */
	public Date getLastAccess() {
		return lastAccess;
	}

	/**
	 * @param lastAccess
	 *            the lastAccess to set
	 */
	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}

	/**
	 * @return the inventory
	 */
	public CharacterInventory getInventory() {
		return inventory;
	}

	/**
	 * @return the appearance
	 */
	public CharacterAppearance getAppearance() {
		return appearance;
	}

	/**
	 * @return the base attributes
	 */
	public CharacterBaseAttributes getBaseAttributes() {
		return baseAttributes;
	}

	/**
	 * @return the attributes
	 */
	public CharacterAttributes getAttributes() {
		return attributes;
	}

	/**
	 * @return the friendList
	 */
	public CharacterFriendList getFriendList() {
		return friendList;
	}

	/**
	 * @return the shortcuts
	 */
	public CharacterShortcutContainer getShortcuts() {
		return shortcuts;
	}

	@Override
	public CharacterID getID() {
		return (CharacterID) super.getID();
	}
}