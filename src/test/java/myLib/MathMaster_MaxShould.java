package myLib;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MathMaster_MaxShould {
    private MathMaster mathMaster;

    public MathMaster_MaxShould() {
        mathMaster = new MathMaster();
    }

    @Test
    @Parameters({
        "89,89,89",
        "-40789,-40789,-40789",
        "275,275,275"
    })
    public void returnValueWhenValueOfOperandsSame(int value1, int value2, int expectedResult) {
        int result = mathMaster.max(value1,value2);
        Assert.assertEquals(expectedResult, result);
    }

}