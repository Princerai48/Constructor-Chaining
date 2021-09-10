public class Test
{
     Test(int i,int j)
    {
        System.out.println("double arg con.... "+(i+j));
    }
     Test(int i)
     {
         this(10, 20);
         System.out.println("single arg con.... "+ i);
     }

    Test ()
    {
        this(10);
        System.out.println( "default con.... ");
    }
    public static void main(String [] args) {
        new Test();
    }

}
