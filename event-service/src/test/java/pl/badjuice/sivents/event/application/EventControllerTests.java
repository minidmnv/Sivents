package pl.badjuice.sivents.event.application;

import static org.junit.Assert.*;

public class EventControllerTests {

    EventController eventController = new EventController();

    public void eventControllerShouldReturnEventFromRepository() {
        eventController.getEventById(666);
    }

}