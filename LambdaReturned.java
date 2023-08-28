@FunctionalInterface
interface My{
    //Anonymous function
    String Show(String name);
}

class ReturnedString
{
    public static void main(String [] args)
    {
        My s = (String name) -> name;
                
        String myself = s.Show("Muhammad Shariq Shafiq");
        System.out.println("Hello MySelf "+ myself);
    }
} 
