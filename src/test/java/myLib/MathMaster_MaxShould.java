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

    @Test
    @Parameters({
        "1,2,2",
        "-789,-52,-52",
        "7000,275,7000"
    })
    public void returnMaxOfTwoDifferentValues(int value1, int value2, int expectedResult) {
        int result = mathMaster.max(value1, value2);
        Assert.assertEquals(expectedResult, result);
    }

    /**
     * Test the fact that Max is commutative - returns the same 
     * result independent of the order of the operands.
     */
    @Test
    public void returnSameResultIndependentOfOrder() {
        
        // Arrange
        int x = 9;
        int y = 87;

        // Act 
        int result1 = mathMaster.max(x,y);
        int result2 = mathMaster.max(y,x);

        // Assert
        Assert.assertEquals(result1, result2);
    }
}