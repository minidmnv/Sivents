package pl.badjuice.sivents.event.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.badjuice.sivents.event.domain.Event;

@RestController
@RequestMapping("/event/")
public class EventController {

    @GetMapping("{eventId}")
    public Event getEventById(@PathVariable Integer eventId) {
        return null;
    }

}
