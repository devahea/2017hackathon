package org.ahea;

import lombok.extern.apachecommons.CommonsLog;
import nl.flotsam.xeger.Xeger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by mio on 2017. 8. 15..
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@CommonsLog
public class BootTest {
    @Test
    public void test() {
        String regex = "[ab]{4,6}c";
        Xeger generator = new Xeger(regex);
        String result = generator.generate();
        assert result.matches(regex);
    }
}
