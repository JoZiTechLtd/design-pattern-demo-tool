package Adaptor;

public class OggPlayer implements AdvMediaPlayer {

	@Override
	public void playFlac(String fileName) {
		// DO NOTHING

	}

	@Override
	public void playOgg(String fileName) {
		System.out.println("Now Playing: " + fileName + ".ogg");

	}

}
