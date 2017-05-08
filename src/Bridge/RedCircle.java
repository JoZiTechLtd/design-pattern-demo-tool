package Bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		
		System.out.println("Drawing Circle (Colour: Red, Radius: " + radius + ", x: " + x + ", " + y + ")");

	}

}
