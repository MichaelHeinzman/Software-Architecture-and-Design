package app.emotional;


public class EmotionalInformation {
	private EmotionalInformationItem[] emotionalInformation;
	
	public EmotionalInformation (String type) {
		this.populateEmotionalInformation(this.fetchEmotionalInformationFromResource(type, ""));
	}
	
	public void render() {
		System.out.println("\n\t\tRendering Emotional Information List.");
		if (this.emotionalInformation == null)  System.out.println("\tNo emotional information Available.");
		if (this.emotionalInformation != null) {
			System.out.println("\t\tEmotional Information:");
			for (EmotionalInformationItem emotionalInformationItem : this.emotionalInformation) {
				emotionalInformationItem.render();
			}
		}
	}
	
    private void populateEmotionalInformation(EmotionalInformationItem[] emotionalInformation) {
    	if (emotionalInformation != null) {
    		this.emotionalInformation = emotionalInformation;
    	}
    }
    
    private EmotionalInformationItem[] fetchEmotionalInformationFromResource(String type, String filter) {
    	if (type == "professionals") {
        	EmotionalInformationItem[] emotionalInformation = EmotionalInformationFactory.createEmotionalInformationItemsForProfessionals(3);
        	return emotionalInformation;	
    	} else {
        	EmotionalInformationItem[] emotionalInformation = EmotionalInformationFactory.createEmotionalInformationItems(3);
        	return emotionalInformation;
    	}
    }
    
    private void searchEmotionalInformation() {
    	System.out.println("\n\t\tSearching Emotional Information");
    	this.populateEmotionalInformation(fetchEmotionalInformationFromResource("", "SomeFilter"));
    }
}
