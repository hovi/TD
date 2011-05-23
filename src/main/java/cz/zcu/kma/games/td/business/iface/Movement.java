package cz.zcu.kma.games.td.business.iface;

import cz.zcu.kma.games.td.business.Target;

public interface Movement {

	void move(Target target, Position destination);
}
