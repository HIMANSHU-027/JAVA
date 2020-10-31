public class AddNum 
{

   int x=10;
   static int y=20;
   
 
  void show() {
   
    System.out.println(+x"\t"+y);
    
  }

  void incriment()
  {
    x++;
    y++;
  }

  public static void main(String [] arg)
 {
      AddNum obj1=new AddNum();
        obj1.incriment();
      AddNum obj2=new AddNum();
        obj2.show();
        
        
      }

}
