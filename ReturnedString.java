@FunctionalInterface
interface My{
    //Anonymous function
    String Show(String name);
}

class ReturnedString
{
    public static void main(String [] args)
    {
        My s = new My()
        {
            public String Show(String name){
                return name;
            }    
        };
        String myself = s.Show("Muhammad Shariq Shafiq");
        System.out.println("Hello MySelf "+ myself);
    }
} 
