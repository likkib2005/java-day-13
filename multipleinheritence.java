import java.util.*;
class args{
    public void p1()
    {
        System.out.println("Hello Students");
    }
}
class b extends a
{
    public void r()
    {
        System.out.println("Hello teachers");
    }
}
class c extends b
{
    public void r1()
    {
    System.out.println("Hello professor");
}
}
 class multipleinheritence
{
    public static void main(String args[])
    {
        c h1=new c();
        h1.r();
        h1.r1();
        h1.p1();
    }
}