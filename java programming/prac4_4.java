class prac4_4 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");
    }
}

class A {
    static int x = 10; 
}

class B extends A {
    int x = 20; 

    void display() {
        System.out.println("Static variable x from class A: " + A.x);
        System.out.println("Instance variable x from class B: " + x);
    }
}
