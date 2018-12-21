package pl.badjuice.sivents.event.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.badjuice.sivents.event.EventApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventApplicationTest {

    @Test
    public void contextLoads() {
    }

    @Test
    public void cleanStart() {
        EventApplication.main(new String[]{});
    }

}
