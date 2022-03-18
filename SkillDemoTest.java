import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Test.*;

public class SkillDemoTest {

    public static void main(String[] args) {

    }

    //Fail Initially
    @Test
    public void testLog() {
        Assert.assertEquals(1, SkillDemo.naturalLog(1));
    }
}