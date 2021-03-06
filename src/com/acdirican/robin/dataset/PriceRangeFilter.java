package com.acdirican.robin.dataset;

import java.util.ArrayList;
import java.util.List;

import com.acdirican.robin.dataset.entities.Dataset;
import com.acdirican.robin.dataset.entities.FilterDecorator;
import com.acdirican.robin.dataset.entities.Property;

class PriceRangeFilter extends FilterDecorator{
	
	private double lowest;
	private double highest;

	public PriceRangeFilter(Dataset dataset, double lowest, double highest) {
		super(dataset.properties());
		this.highest = highest;
		this.lowest = lowest;
		execute();
	}

	@Override
	public void execute() {
		List<Property> filtered =  new ArrayList<>();
		for (Property property : properties) {
			if (property.getPrice()>= lowest && property.getPrice()<=highest) {
				filtered.add(property);
			}
		 }
		this.properties = filtered;
	}



}
