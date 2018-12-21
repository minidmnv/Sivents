package pl.badjuice.sivents.event.domain;

import org.springframework.data.annotation.Id;
import pl.badjuice.sivents.event.domain.owner.Owner;

public class Event {

    @Id
    public final Integer id;
    public final String title;
    public final Owner owner;

    public Event(Integer id, String title, Owner owner) {
        this.id = id;
        this.title = title;
        this.owner = owner;
    }

    private Event(Builder builder) {
        id = builder.id;
        title = builder.title;
        owner = builder.owner;
    }


    public static final class Builder {
        private Integer id;
        private String title;
        private Owner owner;

        public Builder() {
        }

        public Builder(Event copy) {
            this.id = copy.id;
            this.title = copy.title;
            this.owner = copy.owner;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public Event build() {
            return new Event(this);
        }
    }
}
