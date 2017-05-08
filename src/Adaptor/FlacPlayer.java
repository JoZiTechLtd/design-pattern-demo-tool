package Adaptor;

public class FlacPlayer implements AdvMediaPlayer {

	@Override
	public void playFlac(String fileName) {
		System.out.println("Now Playing: " + fileName + ".flac");
	}

	@Override
	public void playOgg(String fileName) {
		// DO NOTHING

	}

}
