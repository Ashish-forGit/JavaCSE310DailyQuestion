class Inst
{
    public static void main(String[] args)
    {
        String name = "Hello";

        boolean result = name instanceof String;
        System.out.println("name is instance of String :"+ result);

        Inst obj = new Inst();

        boolean result2 = obj instanceof Inst;
        System.out.println("obj is instance of Inst :" + result2);




    }
}