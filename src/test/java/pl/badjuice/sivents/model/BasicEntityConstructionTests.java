package pl.badjuice.sivents.model;

import org.junit.Assert;
import org.junit.Test;

public class BasicEntityConstructionTests {

    @Test
    public void constructorShouldSetId() {
        BasicEntity createdEntity = new BasicEntity(666);
        Assert.assertEquals(new Integer(666), createdEntity.id);
    }
}
