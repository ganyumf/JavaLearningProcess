package Ex10t3;

public class student {
    String name;
    int age;
    public student(String name,int age){
        this.name=name;
         this.age=age;
 }
    public void getName(){
        System.out.println(name);
        
    }
    public void getAge(){
        System.out.println(age);
    }
    public static void main(String[] args) {
        student student = new student("ÕÅÈı",23);
        student.getName();
        student.getAge();
    }
}