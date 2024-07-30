public class prac4_6 {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.methodP1();
        obj.methodP2();
        System.out.println("This practical is made by 23CS041 - DHRUV LOKADIYA");
    }
}

interface P1{
    int constant_P1 = 1;
    void methodP1();
}

interface P2{
    int constant_P2 = 2;
    void methodP2();
}

interface P12 extends P1,P2{
    void methodP12();
}

class Q implements P12{
    public void methodP1(){
        System.out.println("Method of P1, constant : " + constant_P1);
    }

    public void methodP2(){
        System.out.println("Methof of P2, constant : " + constant_P2);
    }

    public void methodP12(){
        
    }
}
