package cz.zcu.kma.games.td.business.impl;

import cz.zcu.kma.games.td.business.iface.Position;

public class IntegerPosition2D implements Position {

	private final int x;

	private final int y;

	public IntegerPosition2D(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 0-360
	 */
	private double angle;

	@Override
	public double getDistance(final Position pos) {
		if (pos == null) {
			throw new NullPointerException("Position cannot be null");
		}
		if (!(pos instanceof IntegerPosition2D)) {
			throw new IllegalArgumentException("Position must be instance of Position2D");
		}
		IntegerPosition2D position = (IntegerPosition2D) pos;
		return Math.sqrt(Math.pow(x - position.x, 2) + Math.pow(y - position.y, 2));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getAngle() {
		return angle;
	}

	@Override
	public String toString() {
		return "IntegerPosition2D [x=" + x + ", y=" + y + ", angle=" + angle + "]";
	}

}
