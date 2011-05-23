package cz.zcu.kma.games.td.business.impl;

import java.util.Arrays;
import java.util.List;

import cz.zcu.kma.games.td.business.iface.BlockedGround;
import cz.zcu.kma.games.td.business.iface.Position;

public class SingleBlockedGroundType implements BlockedGround {

	@Override
	public List<Position> getBlockedPositions(final Position position) {
		return Arrays.asList(new Position[] { position });
	}
}
