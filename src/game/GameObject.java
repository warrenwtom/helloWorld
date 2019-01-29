package game;

public abstract class GameObject {

	// abstract method must be implemented by any and all classes that extends GameObject
	public abstract void draw();
	
	public static void main(String[] args) {
		// GameObject myObject = new GameObject();
		// Will not work; abstract classes exist to be extended; they cannot be instantiated

		GameObject player = new Player();
		//player.draw();
		
		GameObject menu = new Menu();
		//menu.draw();
		
		GameObject[] gameObjects = new GameObject[2];
		gameObjects[0] = player;
		gameObjects[1] = menu;
		
		for (GameObject obj : gameObjects) {
			obj.draw();
		}
	}
}
