package pl.badjuice.sivents.event.domain.event;

import org.junit.Ignore;
import org.junit.Test;
import pl.badjuice.sivents.event.domain.Event;

import static org.junit.Assert.assertEquals;

public class EventConstructionTests {

    @Test
    public void constructorShouldSetTitle() {
        String eventTitle = "Totally common title";
        Event createdEvent = new Event(null, eventTitle, null);
        assertEquals(eventTitle, createdEvent.title);
    }

    @Ignore
    @Test
    public void constructorShouldSetOwner() {

    }

    @Test
    public void eventBuilderShouldSetAllFields() {
        String eventTitle = "Title from builder of course";
        Integer eventId = 666;

        Event event = new Event.Builder().id(eventId).owner(null).title(eventTitle).build();

        assertEquals(eventTitle, event.title);
        assertEquals(null, event.owner);
        assertEquals(eventId, event.id);
    }

    @Test
    public void eventBuilderFromCopyShouldSetAllFields() {
        String eventTitle = "Title from builder of course";
        Integer eventId = 666;

        Event event = new Event.Builder().id(eventId).title(eventTitle).owner(null).build();
        Event eventFromCopy = new Event.Builder(event).build();

        assertEquals(eventTitle, eventFromCopy.title);
        assertEquals(null, eventFromCopy.owner);
        assertEquals(eventId, event.id);
    }

}