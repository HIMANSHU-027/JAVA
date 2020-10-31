public class Katori
{
    public int add(int a,int b)
    {
      int c=a+b;
      return c; 
    }
    public static void main(String[] args)
    {
      Katori first=new Katori();
      int total=first.add(22,2);
    System.out.println("Total Of Two Numbers -> "+total);
  }

}