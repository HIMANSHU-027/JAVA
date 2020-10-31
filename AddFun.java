package himanshu;
public class AddFun
{
    void Add()
    {
        int a=10;
        int b=24;
        int c;
        c=a+b;
      System.out.println("Total ->"+c);
    }
    public static void main(String[] args)
    {
        AddFun Obj1=new AddFun();
        Obj1.Add();
    }
}