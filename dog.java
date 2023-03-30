 class dog
{
    void eat()
    {
        System.out.println("eating");
    }

class dog extends animal
{
    void bread()
    {
        System.out.println("basking");
    }

public static void main(String[] args)
{
    dog d=new dog();
    d.eat();
    d.bread();
}
}
}