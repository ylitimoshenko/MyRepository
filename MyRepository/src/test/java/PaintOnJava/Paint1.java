package PaintOnJava;

public class Paint1 {
    public static void square(int a){
        for(int i = 0; i <=a; i++){
            for(int j = 0; j <=a; j++){
                System.out.print("&  ");
            }
            System.out.println();
        }
    }

//    public static void square(int h, int d){
//        for(int i = 1; i <= h; i++){
//            int s = d - i;
//            System.out.println(" ".repeat(s) + "*".repeat(i));
//            }
//            System.out.println();
//        }

    public static void main(String[] args) {
        square(4);
    }
}
