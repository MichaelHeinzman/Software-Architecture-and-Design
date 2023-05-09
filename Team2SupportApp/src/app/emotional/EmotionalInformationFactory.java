package app.emotional;
public class EmotionalInformationFactory {
	public static EmotionalInformationItem[] createEmotionalInformationItems(int numItems) {
	    EmotionalInformationItem[] emotionalInformation = new EmotionalInformationItem[numItems];
	    for (int i = 0; i < numItems; i++) {
	        EmotionalInformationItem item = new EmotionalInformationItem("Random Info Item");
	        emotionalInformation[i] = item;
	    }
	    return emotionalInformation;
	}
	
	public static EmotionalInformationItem[] createEmotionalInformationItemsForProfessionals (int numItems) {
	    EmotionalInformationItem[] emotionalInformation = new EmotionalInformationItem[numItems];
	    for (int i = 0; i < numItems; i++) {
	        EmotionalInformationItem item = new EmotionalInformationItem("Professional");
	        emotionalInformation[i] = item;
	    }
	    return emotionalInformation;
	}
}
