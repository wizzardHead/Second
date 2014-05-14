package com.pkrm.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyListener implements PhaseListener {

	public MyListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterPhase(PhaseEvent phaseEvent) {
		// TODO Auto-generated method stub
		System.out.println("Calling after phase with PhaseEvent"+phaseEvent.getPhaseId());
		
	}

	@Override
	public void beforePhase(PhaseEvent phaseEvent) {
		// TODO Auto-generated method stub
		System.out.println("Inside Before Phase for PhaseId"+phaseEvent.getPhaseId());
		
	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}

}
