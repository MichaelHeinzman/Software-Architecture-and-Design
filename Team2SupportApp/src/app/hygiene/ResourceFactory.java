package app.hygiene;

import java.util.Random;

public class ResourceFactory {

    private static final String[] NAMES = {"Hand sanitizer", "Disinfectant wipes", "Disposable masks", "Gloves", "Paper towels"};
    private static final String[] TYPES = {"Liquid", "Wipes", "Cloth", "Spray", "Foam"};
    private static final String[] LOCATIONS = {"Bathroom", "Kitchen", "Classroom", "Library", "Lounge"};
    private static final String[] CATEGORIES = {"Sanitation", "Hygiene", "PPE"};

    public static Resource[] createResources(int numResources) {
        Resource[] resources = new Resource[numResources];
        Random random = new Random();

        for (int i = 0; i < numResources; i++) {
            String name = NAMES[random.nextInt(NAMES.length)];
            String type = TYPES[random.nextInt(TYPES.length)];
            String location = LOCATIONS[random.nextInt(LOCATIONS.length)];
            int quantity = random.nextInt(50) + 1;
            String category = CATEGORIES[random.nextInt(CATEGORIES.length)];
            String contactPerson = "Resource Contact " + (i + 1);

            resources[i] = new Resource(name, type, location, quantity, category, contactPerson);
        }

        return resources;
    }
}
