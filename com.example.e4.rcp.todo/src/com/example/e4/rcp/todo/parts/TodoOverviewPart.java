
package com.example.e4.rcp.todo.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Composite;

public class TodoOverviewPart {

	@PostConstruct
	public void postConstruct(Composite parent) {
		
	}
	
	@Inject
	@Optional
	public void receiveActivePart(
	    @Named(IServiceConstants.ACTIVE_PART) MPart activePart) {
	    if (activePart != null) {
	        System.out.println("Active part changed " + activePart.getLabel());
	    }
	}

}