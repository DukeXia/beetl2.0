package org.beetl.core.attr;

import java.util.List;


public class ListAA extends AA {


	@Override
	public Object value(Object o,  Object attr) {
		int index = ((Number)attr).intValue();
		return ((List)o).get(index);
	}

	
}
