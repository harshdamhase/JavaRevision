public class encapsulation
{
    private int id;
    private String name;

    public int getid(int id)
    {
        return id;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public String getName(String name)
    {
     return name;

    }
    public void setName(String name)
    {
        this.name=name;
    }
    
    public static void main(String[] args)
    {
       encapsulation en=new encapsulation();
       System.out.println(en.add); 
    }
}