class Student{
    String Name;
    int Roll;
    String ID;
    void Show(){
        System.out.println(Name);
        System.out.println(Roll);
        System.out.println(ID);
    }
}
public class Main{
    public static void main(String[] args){
        Student S1=new Student();
        S1.Name="Mahmud";
        S1.Roll=10;
        S1.ID="IT-24024";
        S1.Show();
    }
}
