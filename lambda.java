@FunctionalInterface
interface My {
    //Anonymous function
    void Show(String name);
}

class lambda
{
    public static void main(String [] args)
    {
        My s = (String name) ->  System.out.println("Hello From " + name);
  
        
        s.Show("Shariq");
    }
}

