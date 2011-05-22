package cz.zcu.kma.games.td.business;

import cz.zcu.kma.games.td.business.iface.Position;

public class Position2D implements Position {

	protected double x;

	protected double y;

	public double getDistance(Position pos) {
		if (pos == null) {
			throw new NullPointerException("Position cannot be null");
		}
		if (!(pos instanceof Position2D)) {
			throw new IllegalArgumentException("Position must be instance of Position2D");
		}
		Position2D position = (Position2D) pos;
		return Math.sqrt(Math.pow(x - position.x, 2) + Math.pow(y - position.y, 2));
	}
}
