package cz.zcu.kma.games.td.business.impl;

import cz.zcu.kma.games.td.business.iface.Position;

public class Position2D implements Position {

	private double x;

	private double y;

	/**
	 * 0-360
	 */
	private double angle;

	@Override
	public double getDistance(final Position pos) {
		if (pos == null) {
			throw new NullPointerException("Position cannot be null");
		}
		if (!(pos instanceof Position2D)) {
			throw new IllegalArgumentException("Position must be instance of Position2D");
		}
		Position2D position = (Position2D) pos;
		return Math.sqrt(Math.pow(x - position.x, 2) + Math.pow(y - position.y, 2));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getAngle() {
		return angle;
	}
}
