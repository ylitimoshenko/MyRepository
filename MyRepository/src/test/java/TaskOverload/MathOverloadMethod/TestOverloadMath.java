package TaskOverload.MathOverloadMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOverloadMath {

    @Test
    public void areaOfRectangle(){
        OverloadMath overloadMath = new OverloadMath();
        System.out.println(overloadMath.resultMathOperation(14, 27));
        Assert.assertTrue(overloadMath.resultMathOperation(14,27) == 378);
    }
    @Test
    public void areaOfCircle(){
        OverloadMath overloadMath = new OverloadMath();
        System.out.println(overloadMath.resultMathOperation(75));
        Assert.assertTrue(overloadMath.resultMathOperation(75) == 150);
    }
    @Test
    public void mathOperation(){
        OverloadMath overloadMath = new OverloadMath();
        System.out.println(overloadMath.resultMathOperation(13, 32, 4));
        Assert.assertTrue(overloadMath.resultMathOperation(13, 32, 4) ==141);
    }
}
