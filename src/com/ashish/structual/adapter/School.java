package com.ashish.structual.adapter;

import java.awt.peer.PanelPeer;

public class School implements Pen {
	PenAdapter PenAdapter = new PenAdapter();

	public void writeAssignment() {
		write();
	}

	@Override
	//Not have implemantaion, using third party Implmentaion
	public void write() {
		PenAdapter.write();

	}
}
