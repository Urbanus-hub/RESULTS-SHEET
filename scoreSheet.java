import java.util.Scanner;
class ScoreSheet {
public static void main(String[]args){
String Name="Urbanus Kioko";
String RegNo="C026-01-0937/2022";
String Semester="2nd semester";
Scanner input=new Scanner(System.in);
System.out.println("Enter marks for database:");
int d=input.nextInt();
System.out.println("Enter the unit code for database:");
String Ud=input.next();
System.out.println("Enter marks for Systems:");
int s=input.nextInt();
System.out.println("Enter the unit Code for Systems:");
String Us=input.next();
System.out.println("Enter marks for Algorithm:");
int a=input.nextInt();
System.out.println("Enter unit code for Algorithm:");
String Ua=input.next();
System.out.println("Enter marks for statistics:");
int St=input.nextInt();
System.out.println("Enter the unitCode for Statistics:");
String USt=input.next();
int total=d+s+a+St;
double average=total/4;
String grade="0";
if(average>70&&average<100){
    grade="A";

}

else if(average>60&&average<70){
        grade="B";
    
}
else if(average>50&&average<60){
        grade="C";
    
}
else if(average>40&&average<50){
        grade="D";
    
}
else if(average<40){
        grade="F";
    
}
System.out.println("\t\t\tDepartment of Computer Science");
System.out.println("\t\t\t     End of Semester Results");
System.out.println("-------------------------------------------------------------------------");
System.out.println("|Name:-"+Name +"  |Roll_No:"+RegNo+"  |Semester:"+Semester);
System.out.println("_________________________________________________________________________");
System.out.println("|Unit code\t      |Unit Name\t\t  Score");
System.out.println("-------------------------------------------------------------------------");
System.out.println("|"+Ud+"\t      |Database\t\t          |"+d);
System.out.println("|"+Us+"\t      |Systems \t\t          |"+s);
System.out.println("|"+Ua+"\t      |Algorithms\t\t  |"+a);
System.out.println("|"+USt+"\t      |Statistics\t\t  |"+St);
System.out.println("-------------------------------------------------------------------------");
System.out.println("|Total\t\t\t\t\t\t  |"    +total);
System.out.println("-------------------------------------------------------------------------");
System.out.println("|Average\t\t\t\t\t  |"    +average);
System.out.println("-------------------------------------------------------------------------");
System.out.println("|Grade\t\t\t\t\t\t  |"       +grade);
System.out.println("-------------------------------------------------------------------------");
System.out.println("|\t\t\t\t    Recommendation|");
System.out.println("-------------------------------------------------------------------------");
System.out.println("Grading Criteria\t Overall Grade(A-D)\tRecommend pass");
System.out.println("70-100          A\t");
System.out.println("60-70           B\t");
System.out.println("50-60           C\t");
System.out.println("40-50           D\t");
System.out.println("Below 40        F\t");
System.out.println("-------------------------------------------------------------------------");
}
}