package Lesson17;

public class coptr {
    static  String name;
    static String fpv;
    static String dji;
    static double ver;

    public coptr(String name, String fpv, String dji, double ver) {
        this.name = fpv;
        this.fpv = fpv;
        this.dji = dji;
        this.ver = ver;
    }

    public void drone(String fpv,  double ver){

        System.out.println("Модель коптера - " + fpv + " версия - " + coptr.ver);
    }
    public void drone1(String dji, double ver){
        System.out.println("Модель коптера - " + dji + " версия - " + coptr.ver);
    }

    public static void main(String[] args) {
        coptr vivod = new coptr(name, fpv, dji, ver);

    }


}

