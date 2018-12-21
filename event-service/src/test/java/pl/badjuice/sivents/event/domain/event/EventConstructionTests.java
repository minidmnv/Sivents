package pl.badjuice.sivents.event.domain.event;

import org.junit.Ignore;
import org.junit.Test;
import pl.badjuice.sivents.event.domain.Event;

import static org.junit.Assert.assertEquals;

public class EventConstructionTests {

    @Test
    public void constructorShouldSetTitle() {
        String eventTitle = "Totally common title";
        Event createdEvent = new Event(eventTitle, null);
        assertEquals(eventTitle, createdEvent.title);
    }

    @Ignore
    @Test
    public void constructorShouldSetOwner() {

    }

    @Test
    public void eventBuilderShouldSetAllFields() {
        String eventTitle = "Title from builder of course";
        Event event = new Event.Builder(eventTitle, null).build();

        assertEquals(eventTitle, event.title);
        assertEquals(null, event.user);
    }

    @Test
    public void eventBuilderFromCopyShouldSetAllFields() {
        String eventTitle = "Title from builder of course";
        Event event = new Event.Builder(eventTitle, null).build();
        Event eventFromCopy = new Event.Builder(event).build();

        assertEquals(eventTitle, eventFromCopy.title);
        assertEquals(null, eventFromCopy.user);
    }

}