import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable<student>{

    int rollno;
    String name;
    int age;
    student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(student o) {
        if(name.charAt(0) == o.name.charAt(0))
            return 0;
        else if(name.charAt(0) > o.name.charAt(0))
            return 1;
        else
            return -1;
    }
}
public class students {
    public static void main(String[] args) {
        ArrayList<student> s = new ArrayList<>();
        s.add(new student(100,"Shovon",23));
        s.add(new student(103,"Digu",22));
        s.add(new student(101,"Ahad",21));

        for (student ex : s){
            System.out.println(ex.rollno+" "+ex.name +" "+ex.age);
        }

        Collections.sort(s);

        for (student ex : s){
            System.out.println(ex.rollno+" "+ex.name +" "+ex.age);
        }

    }
}
