public class conpara {
     int id;
     String name;

	conpara(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args)
	{
		conpara c1=new conpara(11,"ketan");
		conpara c2=new conpara(10,"adity");
		System.out.println(c1.id+""+c1.name);
		System.out.println(c2.id+""+c2.name);
}
}