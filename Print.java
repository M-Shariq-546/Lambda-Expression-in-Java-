@FunctionalInterface
interface My {
    void Show(String name);
}

class Print
{
    public static void main(String [] args)
    {
        My s = new My()
        {
            public void Show(String name)
            {
                System.out.println("Hello From " + name);
            }   
        };
        s.Show("Shariq");
    }
}

