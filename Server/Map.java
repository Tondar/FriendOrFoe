package Server;

class Map {
	
	private Field[][] map;
	
	Map(int length, int height) {
		this.map = new Field[height][length];
	}
	
	
	private class Field {
		int terrain;
		int owner;
		ArrayList <Unit> units;
	}
	
}
