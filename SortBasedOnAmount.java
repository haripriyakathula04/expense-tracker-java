package com.business_layer;
import java.util.Comparator;
public class SortBasedOnAmount implements Comparator<Expense> {
	@Override
	public int compare(Expense o1, Expense o2) {
		if(o1.getAmount()>o2.getAmount())
			return 1;
		else if(o1.getAmount()<o2.getAmount())
			return -1;
		else
			return 0;
	}
}
