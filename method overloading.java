class MethodOverloading
{
    void display(int a)
    {
        System.out.println("Arguments: " + a);
    }

     void display(int a, int b)
     {
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args)
    {
		MethodOverloading m1=new MethodOverloading();
        m1.display(1);
        m1.display(1, 4);
    }
}
