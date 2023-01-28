class Data
{
    private String name;
      // Getter
    public String getName() {
      return this.name;
      }
  
  // Setter method
  public void setName(String name) {
    this.name = name;

}
}
public class Main
{
    public static void main(String[] args)
    {
        Data d = new Data();
        d.setName("ashish");
        System.out.println(d.getName());
    }
}