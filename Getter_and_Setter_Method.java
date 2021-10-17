class Employee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setId(int i){
        this.id = i;
    }

    public int getId(){
        return id;
    }
}



public class Getter_and_Setter {
    public static void main(String[] args) {
        Employee obj = new Employee();
       // obj.id = 45;
       // obj.name = "Naman Saini"          // Error due to private access modifiers
        obj.setName("Naman Saini");
        System.out.println(obj.getName());
        obj.setId(45);
        System.out.println(obj.getId());

    }


}
