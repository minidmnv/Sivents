package pl.badjuice.sivents.event.domain.owner;

import org.junit.Test;

import static org.junit.Assert.*;

public class OwnerCreationTests {

    @Test
    public void constructorShouldSetId() {
        Integer ownerId = 666;
        Owner createdOwner = new Owner(ownerId);
        assertEquals(ownerId, createdOwner.id);
    }

}