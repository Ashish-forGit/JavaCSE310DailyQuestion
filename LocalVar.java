public class LocalVar
{
    public void pupAge()
    {
        int age = 0;
        age = age + 7;
        System.out.println("puppy age is : " + age);
    }

    public static void main (String[] args)
    {
        LocalVar local = new LocalVar();
        local.pupAge();
    }
}