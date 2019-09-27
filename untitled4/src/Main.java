import sun.awt.geom.AreaOp;

public class Main {
    public static void main(String[] args) {
        //Question 1
        int x = 5;
        int y = 7;
        System.out.println(((x*4) < (y + 15)) && x < y);

        //Question 2
        x = 10;
        y = 20;
        int z = 30;
        System.out.println((( x == y) || (x < z)) && (x*2 + y)/5 > z);

        //question 3
        boolean a = true;
        boolean b = false;
        System.out.println((a || b) && ((a == b) || a));

        //question 4
        a = false;
        b = false;
        x = 5;
        y = 10;
        System.out.println((a == b) && (x * 4) == (y % 6) * 5);

        //question 5
        System.out.println((Math.abs(-2) == 2) || (Math.sqrt(Math.pow(9,2)) <= 9 && (-4 <= 4)));


    }
}