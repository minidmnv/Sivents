package pl.badjuice.sivents.event.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.badjuice.sivents.event.domain.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {



}
