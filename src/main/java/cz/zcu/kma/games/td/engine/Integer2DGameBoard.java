package cz.zcu.kma.games.td.engine;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import cz.zcu.kma.games.td.business.Target;
import cz.zcu.kma.games.td.business.Tower;
import cz.zcu.kma.games.td.business.iface.Position;
import cz.zcu.kma.games.td.business.iface.Positionable;
import cz.zcu.kma.games.td.business.impl.IntegerPosition2D;
import cz.zcu.kma.games.td.graphics.GameRenderer;

public class Integer2DGameBoard {

	public static final int MINIMAL_SIZE = 5;

	protected final Logger log = Logger.getLogger(Integer2DGameBoard.class);

	private final int x;

	private final int y;

	private final Positionable[][] board;

	private final List<Target> targets = new ArrayList<Target>();

	private final List<Tower> towers = new ArrayList<Tower>();

	public static void main(final String[] args) {
		Integer2DGameBoard board = new Integer2DGameBoard(20, 10);
		board.buildTower(new Tower(new IntegerPosition2D(0, 0)));
		board.buildTower(new Tower(new IntegerPosition2D(0, 0)));
		new GameRenderer(board).render();
	}

	public Integer2DGameBoard(final int x, final int y) {
		if (x < MINIMAL_SIZE || y < MINIMAL_SIZE) {
			throw new IllegalArgumentException("X and Y has to be greater or equal " + MINIMAL_SIZE);
		}
		this.x = x;
		this.y = y;
		board = new Positionable[x][y];
	}

	public void buildTower(final Tower tower) {
		IntegerPosition2D position = (IntegerPosition2D) tower.getPosition();
		validatePosition(position);
		if (isPositionTaken(position)) {
			log.debug("Position: " + position + " is taken!");
			return;
		}
		board[position.getX()][position.getY()] = tower;
		towers.add(tower);
	}

	public void validatePosition(final Position position) {
		if (!(position instanceof IntegerPosition2D)) {
			throw new IllegalArgumentException("Position has wrong implementation!");
		}
		if (isValidPosition((IntegerPosition2D) position)) {
			throw new IllegalArgumentException("Position out of range! " + position);
		}
	}

	public Positionable[][] getBoard() {
		return board;
	}

	private boolean isValidPosition(final IntegerPosition2D position) {
		return position.getX() < 0 || position.getX() >= x || position.getY() < 0 || position.getY() >= y;
	}

	private boolean isPositionTaken(final IntegerPosition2D position) {
		return board[position.getX()][position.getY()] != null;
	}

}
