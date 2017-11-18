public class RumusMatematika{

    double a, t;
    double l_segitiga;

    public static void main (String[] args){ //termasuk method main
        RumusMatematika rm = new RumusMatematika(); //deklarasi object dengan nama rm
        rm.luasSegitiga(); //pemanggilan method luas segitiga
        infoProgram();
    }

    void luasSegitiga(){// termasuk method void
        a = 7;
        t = 10;
        l_segitiga = 0.5 * 1 * t ;
        System.out.println("Luas Segitiga = " + l_segitiga);
    }
    static infoProgram(){
        System.out.println("Contoh Program")
    }
}
/**
pemanggilan method  luassegitiga  harus dideklarasikan object class nya terlebih dahulu 
karena method luassegitiga tergolong bukan method static 
 */