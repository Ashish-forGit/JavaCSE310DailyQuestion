class Hw2 {

    public static void main(String[] args){
    System.out.println("Name = "+ args[0]);
    System.out.println("Marks1 = "+ args[1]);
    System.out.println("Marks2 = "+ args[2]);
    System.out.println("Marks3 = "+ args[3]);
    float f1= Float.parseFloat(args[1]);
    float f2= Float.parseFloat(args[2]);
    float f3= Float.parseFloat(args[3]);
    float t = f1+f2+f3;
    System.out.println("Total Marks = "+ t);
    System.out.println("Average marks = "+ t/3);   
    }


    
}