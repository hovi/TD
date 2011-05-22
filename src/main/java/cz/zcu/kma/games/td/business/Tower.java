package cz.zcu.kma.games.td.business;

import cz.zcu.kma.games.td.business.iface.TargetStrategy;
import cz.zcu.kma.games.td.business.iface.Position;

public class Tower {

	private Attack attack;
	
	private Projectile projectile;

	private Position position;
	
	private TargetStrategy targetStrategy;

	public Projectile getProjectile() {
		return projectile;
	}

	public Position getPosition() {
		return position;
	}

	public Attack getAttack() {
		return attack;
	}

	public TargetStrategy getTargetStrategy() {
		return targetStrategy;
	}
	
	


}
