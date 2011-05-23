package cz.zcu.kma.games.td.business;

import cz.zcu.kma.games.td.business.iface.Movement;
import cz.zcu.kma.games.td.business.iface.Position;
import cz.zcu.kma.games.td.business.iface.Positionable;
import cz.zcu.kma.games.td.business.iface.Printable;

public class Target implements Positionable, Printable {

	private Movement movement;

	private Position position;

	public Movement getMovement() {
		return movement;
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public char print() {
		return 't';
	}

}
