import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Test.*;

public class SkillDemoTest {

    //Fail Initially
    @Test
    public void testLog() {
        Assert.assertEquals(1, SkillDemo.naturalLog(1));
    }
}