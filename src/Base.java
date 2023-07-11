import java.util.Scanner;
class Base extends Op{
    public void fam(){
    System.out.println("Addition = "+r);
    System.out.println("Subtraction = "+s);
    }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    Base obj = new Base();
    Op o=new Op();
    obj.fam();
    o.add(a,b);
    o.sub(a,b);
}
}
