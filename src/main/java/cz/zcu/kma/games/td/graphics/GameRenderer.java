package cz.zcu.kma.games.td.graphics;


import cz.zcu.kma.games.td.business.iface.Positionable;
import cz.zcu.kma.games.td.business.iface.Printable;
import cz.zcu.kma.games.td.engine.Integer2DGameBoard;

public class GameRenderer {

	private final Integer2DGameBoard gameBoard;

	public GameRenderer(final Integer2DGameBoard gameBoard) {
		this.gameBoard = gameBoard;
	}

	public void render() {
		Positionable[][] positionable = gameBoard.getBoard();
		System.out.print("*");
		for (int x = 0; x < positionable.length; x++) {
			System.out.print("*");
		}
		System.out.println("*");

		for (int y = 0; y < positionable[0].length; y++) {
			System.out.print("*");
			for (int x = 0; x < positionable.length; x++) {
				if (positionable[x][y] != null && positionable[x][y] instanceof Printable) {
					System.out.print(((Printable) positionable[x][y]).print());
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println();
		}

		System.out.print("*");
		for (int x = 0; x < positionable.length; x++) {
			System.out.print("*");
		}
		System.out.println("*");
	}
}
