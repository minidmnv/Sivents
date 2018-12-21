package pl.badjuice.sivents.event.domain.user;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserCreationTests {

    @Test
    public void constructorShouldSetId() {
        Integer ownerId = 666;
        User createdUser = new User(ownerId);
        assertEquals(ownerId, createdUser.id);
    }

}