package edu.arizona.biosemantics.otolite.client.event.hierarchy;

import com.google.gwt.event.shared.EventHandler;

public interface DragStructureStartEventHandler extends EventHandler {
	void onDragStart(DragStructureStartEvent event);
}
