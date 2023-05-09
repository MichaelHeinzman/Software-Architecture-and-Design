package app.cultural;

import java.util.Random;

public class EventFactory {
    // Array of possible event names
    private static final String[] EVENT_NAMES = {"Concert", "Play", "Festival", "Sports Game", "Comedy Show"};
    
    // Array of possible event types
    private static final String[] EVENT_TYPES = {"Music", "Theater", "Sports", "Comedy"};

    // Array of possible event descriptions
    private static final String[] EVENT_DESCRIPTIONS = {
            "Come see the hottest band in town!",
            "Experience the magic of the theater!",
            "Join us for a day of fun and music!",
            "Cheer on your favorite team!",
            "Laugh your heart out at this hilarious show!"
    };

    public static Event[] createEvents(int numEvents) {
        Event[] events = new Event[numEvents];
        Random random = new Random();

        for (int i = 0; i < numEvents; i++) {
            String name = EVENT_NAMES[random.nextInt(EVENT_NAMES.length)];
            String type = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
            String description = EVENT_DESCRIPTIONS[random.nextInt(EVENT_DESCRIPTIONS.length)];
            Event event = new Event(name, type, description);
            events[i] = event;
        }

        return events;
    }
}
