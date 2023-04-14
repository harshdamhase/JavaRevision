public class overload
{
    
        public int add(int a,int b)
        {
return a+b;
        }
        public int add(int a,int b,int c)
        {
return a+b+c;
        }
        public static void main(String[] args)
    {
overload ov=new overload();
ov.add(10,20);

    }
}