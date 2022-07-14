package TaskOverload.MathOverloadMethod;

import org.bouncycastle.pqc.jcajce.provider.qtesla.SignatureSpi;

public class OverloadMath {


    public int resultMathOperation(int dovgina, int shirina) {
        return (dovgina * shirina);
    }

    public  float resultMathOperation(int radius) {
        return (radius * 2);
    }

    public int resultMathOperation(int a, int b, int c){
        return (a + (b * c));
    }

}
