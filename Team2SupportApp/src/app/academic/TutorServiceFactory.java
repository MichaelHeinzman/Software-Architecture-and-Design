package app.academic;

public class TutorServiceFactory {
    public static TutorService[] createTutorServices(int num) {
        TutorService[] services = new TutorService[num];
        for (int i = 0; i < num; i++) {
            services[i] = new TutorService(i+1, "Tutoring Service " + (i+1), true);
            services[i].setId(i);
            services[i].setName("Service" + i);
            services[i].setAvailability(true);
        }
        return services;
    }
}
