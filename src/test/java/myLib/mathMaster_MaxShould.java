package myLib;

import org.junit.Assert;
import org.junit.Test;

public class mathMaster_MaxShould
{
    private MathMaster mathMaster;

    public mathMaster_MaxShould()
    {
        mathMaster = new MathMaster();
    }

    @Test
    public void return0GivenValuesOf0()
    {
        int result = mathMaster.max(0,0);
        Assert.assertEquals(0, result);
    }
}