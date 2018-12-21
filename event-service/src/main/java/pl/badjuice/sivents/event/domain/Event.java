package pl.badjuice.sivents.event.domain;

import pl.badjuice.sivents.event.domain.user.User;

public class Event {

    public final String title;
    public final User user;

    public Event(String title, User user) {
        this.title = title;
        this.user = user;
    }

    private Event(Builder builder) {
        title = builder.title;
        user = builder.user;
    }


    public static final class Builder {
        private final String title;
        private final User user;

        public Builder(String title, User user) {
            this.title = title;
            this.user = user;
        }

        public Builder(Event copy) {
            this.title = copy.title;
            this.user = copy.user;
        }

        public Event build() {
            return new Event(this);
        }
    }
}
