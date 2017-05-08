package Adaptor;

public class AudioPlayer implements MediaPlayer {

	MediaAdaptor ma;
	
	@Override
	public void play(String audioType, String fileName) {
	
		/* The media player has built in support for mp3 files... but wants to play mp4 and avi files...
		 * 
		 * This is where the adaptor comes into play...
		 * to play other formats, it needs to effectively play nice with another media player capable
		 * of playing avi and mp4 files.
		 */
		
		if (audioType.equalsIgnoreCase("mp3")) {
			
			System.out.println("Now Playing: " + fileName + ".mp3");
			
		} else if (audioType.equalsIgnoreCase("flac") || audioType.equalsIgnoreCase("ogg")) {
			
			ma = new MediaAdaptor(audioType);
			ma.play(audioType, fileName);
			
		} else {
			
			//Output error if the format is something other than what the adaptor supports.
			System.out.println("Sorry, \""+ audioType + "\" format is not supported.");
			
		}

	}

}
