public class methodOverride
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add1(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        methodOverride ov=new methodOverride();
        System.out.println(ov.add(10,20));
        System.out.println(ov.add1(2,3));
    }
}
//method overriding is done by  method having parent class and child class
//method overriding is run time polymorphism.
//method overriding rule is that method having same name
//2) mo having same parameter