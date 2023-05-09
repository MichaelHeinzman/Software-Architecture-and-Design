package app.social;

import java.util.HashMap;
import app.pageController.Page;

public class Social implements Page{
    public void render() {
        System.out.println("\nRendering Social Page");
        System.out.println("Interests and Hobby Form Displayed To User");
        System.out.println("Interests and Hobby Form Submitted.");
        HashMap<String, String> interestsAndHobbies = this.interestAndHobbyForm();
        FriendsClub students = new FriendsClub(interestsAndHobbies);
        students.render();
        students.getStudents()[0].contact();
    }
    
    public HashMap<String, String> interestAndHobbyForm() {
        HashMap<String, String> interestsAndHobbies = new HashMap<>();
        
        // Add interests and hobbies to the HashMap
        interestsAndHobbies.put("Music", "Playing guitar");
        interestsAndHobbies.put("Sports", "Basketball");
        interestsAndHobbies.put("Reading", "Science fiction");
        
        return interestsAndHobbies;
    }

}
