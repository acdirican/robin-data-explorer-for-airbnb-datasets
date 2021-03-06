package com.acdirican.robin.dataset;

import java.util.ArrayList;
import java.util.List;

import com.acdirican.robin.dataset.entities.Dataset;
import com.acdirican.robin.dataset.entities.FilterDecorator;
import com.acdirican.robin.dataset.entities.Property;

class RoomTypeFilter extends FilterDecorator{
	
	private String roomType;

	public RoomTypeFilter(Dataset dataset, String roomType) {
		super(dataset.properties());
		this.roomType = roomType;
		execute();
	}

	@Override
	public void execute() {
		List<Property> filtered =  new ArrayList<>();
		for (Property property : this.properties) {
			if (property.getRoom_type().equals(roomType)) {
				filtered.add(property);
			}
		 }
		this.properties = filtered;
	}



}
