
package com.example.e4.rcp.todo.parts;

import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;

public class TodoOverviewPart {

	@PostConstruct
	public void postConstruct(Composite parent) {
		
		System.out.println(this.getClass().getSimpleName() + " @PostConstruct method called.");
		
	}

}