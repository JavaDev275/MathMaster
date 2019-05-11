package myLib;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.*;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class mathMaster_MaxShould
{
    private MathMaster mathMaster;

    public mathMaster_MaxShould()
    {
        mathMaster = new MathMaster();
    }

    @Theory
    public void returnValueWhenValueOfOperandsSame(int value1, int value2, int expectedResult)
    {
        int result = mathMaster.max(value1,value2);
        Assert.assertEquals(expectedResult, result);
    }

    @DataPoints public static int[] firstTest = {89,89,89};
    @DataPoints public static int[] secondTest = {-40789,-40789,-40789};
    @DataPoints public static int[] thirdTest = {275,275,275};
}