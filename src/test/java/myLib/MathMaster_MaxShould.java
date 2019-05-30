package myLib;

import org.junit.Test;

public class MathMaster_MaxShould {
    @Test
    public void return0GivenValuesOf0() {
        MathMaster mathMaster = new MathMaster();
        int result = mathMaster.max(0,0);
        if(result == 0){
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
    }
}