package cz.zcu.kma.games.td.business;

import cz.zcu.kma.games.td.business.iface.BlockedGround;
import cz.zcu.kma.games.td.business.iface.Position;
import cz.zcu.kma.games.td.business.iface.Positionable;
import cz.zcu.kma.games.td.business.iface.Printable;
import cz.zcu.kma.games.td.business.iface.TargetStrategy;

public class Tower implements Positionable, Printable {

	private Attack attack;

	private Projectile projectile;

	private final Position position;

	private TargetStrategy targetStrategy;

	private BlockedGround blockedGround;

	private Prize prize;

	public Tower(final Position position) {
		this.position = position;
	}

	public Projectile getProjectile() {
		return projectile;
	}

	@Override
	public Position getPosition() {
		return position;
	}

	public Attack getAttack() {
		return attack;
	}

	public TargetStrategy getTargetStrategy() {
		return targetStrategy;
	}

	public BlockedGround getBlockedGround() {
		return blockedGround;
	}

	@Override
	public char print() {
		return 'T';
	}

}
