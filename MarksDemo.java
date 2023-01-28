
 class Marks
{
    int engMarks;
    int mathsMarks;
    int phyMarks;
}

class MarksDemo 
{
    public static void main(String[] args)
    {
        Marks obj1 = new Marks();
        obj1.mathsMarks = 80;
        obj1.phyMarks = 90;

        Marks obj2 = new Marks();
        obj2.engMarks=80;
        obj2.mathsMarks=56;
        obj2.phyMarks=85;

        System.out.println("Marks of first object:");
        System.out.println(obj1.engMarks);
        System.out.println(obj1.mathsMarks);
        System.out.println(obj1.phyMarks);
        System.out.println("Marks of second object:");
        System.out.println(obj2.engMarks);
        System.out.println(obj2.phyMarks);
        System.out.println(obj2.mathsMarks);

    }
}