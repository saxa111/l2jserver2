
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
package script.template.item;

import com.google.inject.Inject;
import com.l2jserver.model.id.template.factory.ItemTemplateIDFactory;
import com.l2jserver.model.template.ItemTemplate;
import com.l2jserver.model.template.capability.Stackable;
import com.l2jserver.model.world.Item;

public class AdenaItemTemplate extends ItemTemplate implements Stackable<Item> {
	public static final int ID = 57;

	@Inject
	public AdenaItemTemplate(ItemTemplateIDFactory factory) {
		super(factory.createID(ID));
		this.icon = "icon.etc_adena_i00";
		this.immediateEffect = true;
		this.material = ItemMaterial.GOLD;
		this.price = 1;
	}
}