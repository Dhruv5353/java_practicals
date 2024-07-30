public class prac4_5 {
    public static void main(String[] args) {
        Degree d = new Degree();
        Undergraduate ug = new Undergraduate();
        Postgraduate pg = new Postgraduate();
        d.getDegree();
        ug.getDegree();
        pg.getDegree();
        System.out.println("This practical is made by 23CS041 - DHRUV LOKADIYA");
    }
}

class Degree{
    void getDegree(){
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree{
    void getDegree(){
        System.out.println("I am a Undergraduate");
    }
}

class Postgraduate extends Degree{
    void getDegree(){
        System.out.println("I am a Postgraduate");
    }
}