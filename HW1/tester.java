
/**
 * Write a description of class tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(String[] args){
        charMaster charM = new charMaster();
        char[] hello = new char[]{'h' , 'e' , 'l' , 'l' , 'o'};
        String helloWorld = "helloworld";
        System.out.println(charM.char2str(hello));
        System.out.println(charM.str2char(helloWorld));
        System.out.println(charM.reverse(hello));
        System.out.println(charM.count('l', hello));
        System.out.println(charM.clone(hello));
        System.out.println(charM.equals(hello,hello));

        System.out.println(new Vex(0,1,2));
        Vex x = new Vex(1,0,4), y = new Vex(0,2,-1); 
        System.out.println(x.add(y));
        System.out.println(x.subtract(y));
        Vex z = new Vex(1,0,-3);
        Vex a = new Vex(1,0,4);
        System.out.println(z.scalarMult(3));
        System.out.println(x.innerMult(y));
        System.out.println(x.norm1()); // 5
        System.out.println(y.norm1());
        System.out.println(x.norm2());
        System.out.println(y.norm2());
        System.out.println(x.equals(a));
        System.out.println(x.equals(y));
        System.out.println(x.equals(x.clone()));
        

    }
}
