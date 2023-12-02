
import java.util.*;
import java.io.*;
class gradei {
    
    public void addgrade(ArrayList<Integer>grades) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the grade");
        int grade = scn.nextInt();
        grades.add(grade);
}
public void viewgrades(ArrayList<Integer>vgrade){
    for(int view:vgrade){
        System.out.println("The number of grades present here"+view+"\n");
    }
                                           }
   public void cal(ArrayList<Integer>avgrade){
    double sum =0;
    for(int grade:avgrade){
        sum+=grade;
    }}
    public void highestgrade(ArrayList<Integer>hgrade)
    {
        int max =0;
        for(int grade:hgrade)
        {
            if(grade>max){
                max=grade;
            }
        }
        System.out.println("Highest grade is"+max);
    }
    public void lowestgrade(ArrayList<Integer>lgrade){
         int min =0;
        for(int grade:lgrade)
        {
            if(grade<min){
                min=grade;
            }
        }
        System.out.println("Lowest grade is"+min);

    }
}                  


public class main {
    public static void main(String[] args){
        gradei gi = new gradei();
        ArrayList<Integer>gradesheet = new ArrayList<Integer>();
        
    }
    
}

