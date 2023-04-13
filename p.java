class p{
    public void m1()
    {
        System.out.println("parent class");
    }
    class c extends p
    {
        public  void m2()
        {
            System.out.println("child class");
        }
    }
    public static void main(String args[])
    {
        p a1=new p();
        a1.m1(); //you cannot call parent class method in child cls object

     }
}