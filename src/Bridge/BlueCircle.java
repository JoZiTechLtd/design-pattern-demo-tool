package Bridge;

public class BlueCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		
		System.out.println("Drawing Circle (Colour: Blue, Radius: " + radius + ", x: " + x + ", " + y + ")");

	}

}
