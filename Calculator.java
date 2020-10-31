package himanshu;

public class Calculator
{
    public Integer add(Integer a1,Integer a2)
    {
        a1=100;
        Integer result =a1+a2;
        return result;
    }

    public static void main(String[] args)
    {
        Calculator mo=new Calculator();
        int a1=10;
        int a2=30;
        System.out.println("Before Passing value -> "+a1);
        Integer result=mo.add(a1,a2);
        System.out.println("After Passing value -> "+a1);
        System.out.println("Sum of a1 and a2 -> "+result);
    }
}