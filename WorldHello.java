public class WorldHello
{
    public void NonstaticTest()
    {
        System.out.println("Yes Non-Static Method Is Work Fine..");
    }

    public static void StaticTest()
    {
        System.out.println("Yes Static Method Is Work Fine..");
    }

    public static void main(String[] args)
    {
        System.out.println("This Is Main Method Entery Point Of This Program..");
        WorldHello FirstObj=new WorldHello();
        FirstObj.NonstaticTest();
        StaticTest();
    }
}