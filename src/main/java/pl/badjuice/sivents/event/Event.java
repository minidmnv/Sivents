package pl.badjuice.sivents.event;

import pl.badjuice.sivents.owner.Owner;

public class Event {

    public final String title;
    public final Owner owner;

    public Event(String title, Owner owner) {
        this.title = title;
        this.owner = owner;
    }

    private Event(Builder builder) {
        title = builder.title;
        owner = builder.owner;
    }


    public static final class Builder {
        private final String title;
        private final Owner owner;

        public Builder(String title, Owner owner) {
            this.title = title;
            this.owner = owner;
        }

        public Builder(Event copy) {
            this.title = copy.title;
            this.owner = copy.owner;
        }

        public Event build() {
            return new Event(this);
        }
    }
}
