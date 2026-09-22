
public class Main{
static class Student{
int studentNo;
String name;
String serviceType;
int serviceTime;
Student(int studentNo, String name, String serviceType, int serviceTime) {
this.studentNo = studentNo;
this.name = name;
this.serviceType = serviceType;
this.serviceTime = serviceTime;
}
}
public static void main(String[] args) {
Student[] students = {
new Student(221045678, "Maria", "Registration", 12),
new Student(222034512, "Tomas", "Student Card", 5),
new Student(223041876, "Ndapewa", "Fees", 8),
new Student(221067341, "Simon", "Documents", 4)
};
int totalStudentsServed = students.length;
int totalServiceTime = 0;
int highest = students[0].serviceTime;
int lowest = students[0].serviceTime;
int longerThan10 = 0;
 for (int i = 0; i < 4; i++) {
totalServiceTime += students[i].serviceTime;
if (students[i].serviceTime > highest) {
highest = students[i].serviceTime; 
}
if (students[i].serviceTime < lowest) {
lowest = students[i].serviceTime;
}
if (students[i].serviceTime > 10) {
longerThan10++;
}
}
double average = (double) totalServiceTime / totalStudentsServed;
System.out.println("Total students served: " + totalStudentsServed);
System.out.println("Total service time: " + totalServiceTime + " minutes");
System.out.println("Average service time: " + average + " minutes");
System.out.println("Highest service time: " + highest + " minutes");
System.out.println("Lowest service time: " + lowest + " minutes");
System.out.println("Services longer than 10 minutes: " + longerThan10);
}
}
