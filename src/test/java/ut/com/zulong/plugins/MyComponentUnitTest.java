package ut.com.zulong.plugins;

import org.junit.Test;
import com.zulong.plugins.api.MyPluginComponent;
import com.zulong.plugins.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}