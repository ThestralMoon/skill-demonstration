import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Test.*;

public class SkillDemoTest {

    //Fail Initially
    @Test
    public void testLog() {
        assertEquals(1, SkillDemo.naturalLog(1));
    }
}