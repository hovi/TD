package cz.zcu.kma.games.td.business.iface;

import java.util.List;


public interface BlockedGround {

	List<Position> getBlockedPositions(final Position position);

}