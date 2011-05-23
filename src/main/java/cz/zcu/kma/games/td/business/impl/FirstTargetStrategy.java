package cz.zcu.kma.games.td.business.impl;

import java.util.List;

import cz.zcu.kma.games.td.business.Target;
import cz.zcu.kma.games.td.business.iface.Position;
import cz.zcu.kma.games.td.business.iface.TargetStrategy;

public class FirstTargetStrategy implements TargetStrategy {

	@Override
	public Target chooseTarget (final List<Target> targets, final Target lastTarget) {
		if (targets == null) {
			throw new NullPointerException("Targets cannot be null, use empty list instead!");
		}
		if (!targets.isEmpty()) {
			return targets.get(0);
		}
		return null;
	}
	
	
	//TODO: do enginu
	Target acquireTarget (final Position position, final double range) {
		return null;
	}
}
