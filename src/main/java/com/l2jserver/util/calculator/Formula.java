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
package com.l2jserver.util.calculator;

import java.util.List;

import com.l2jserver.util.calculator.operation.AddOperation;
import com.l2jserver.util.calculator.operation.CalculatorOperation;
import com.l2jserver.util.calculator.operation.SetOperation;
import com.l2jserver.util.calculator.operation.SubtractOperation;
import com.l2jserver.util.factory.CollectionFactory;

public class Formula {
	private List<CalculatorOperation<Integer>> operations = CollectionFactory
			.newList(null);

	public void addOperation(int order, CalculatorOperation<Integer> operation) {
		operations.set(order, operation);
	}

	public void add(int order, int value) {
		addOperation(order, new AddOperation(value));
	}

	public void subtract(int order, int value) {
		addOperation(order, new SubtractOperation(value));
	}

	public void set(int order, int value) {
		addOperation(order, new SetOperation(value));
	}

	public int calculate() {
		int value = 0;
		for (CalculatorOperation<Integer> operation : operations) {
			value = operation.calculate(value);
		}
		return value;
	}
}
