package TestNGAnnotation;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

class FactorySimpleTest2 {
    @Test
    public void testMethod2() {
        System.out.println("This is to test for method 2 for Factor Annotation");
    }
}

class FactoryAnnotation {
    @Factory()
    @Test
    public Object[] getTestFactoryMethod() {
        Object[] factoryTest = new Object[2];
        factoryTest[0] = new annotationsParametrs();
        factoryTest[1] = new FactorySimpleTest2();
        return factoryTest;
    }
}
