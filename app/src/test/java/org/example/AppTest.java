package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppRuns() {
        App app = new App();
        assertNotNull("App instance should not be null", app);
    }
}
