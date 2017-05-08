package Adaptor;

public class MediaAdaptor implements MediaPlayer {

	AdvMediaPlayer amp;
	
	public MediaAdaptor (String audioType) {
		if (audioType.equalsIgnoreCase("ogg")) {
			
			amp = new OggPlayer();
			
		} else if (audioType.equalsIgnoreCase("flac")) {
			
			amp = new FlacPlayer();
			
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		
		if (audioType.equalsIgnoreCase("ogg")) {
			
			amp.playOgg(fileName);
			
		} else if (audioType.equalsIgnoreCase("flac")) {
			
			amp.playFlac(fileName);
			
		}
		
	}

}
