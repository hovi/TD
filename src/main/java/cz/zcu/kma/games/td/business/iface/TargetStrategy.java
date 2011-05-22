package cz.zcu.kma.games.td.business.iface;

import java.util.List;

import cz.zcu.kma.games.td.business.Target;

public interface TargetStrategy {

	Target chooseTarget(List<Target> targets, Target lastTarget);

}