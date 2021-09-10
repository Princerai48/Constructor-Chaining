public class TestCons
{
    void show()
    {
        System.out.println("show method is calling....");
    }

    public static void main(String[] args) {
        TestCons t = new TestCons();
        t.show();
        System.out.println("refid = "+t); //call toString()
        System.out.println("HashCode = "+t.hashCode());
    }
    TestCons()
    {
        System.out.println("default constructor .....");

    }

}
