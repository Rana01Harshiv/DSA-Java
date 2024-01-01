
import java.util.Scanner;
/* 
class Student {
    int rollNo;
    String name;
    String email;
    double percentage;
    Student next;

    Student(int rollNo, String name, String email, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.percentage = percentage;
        this.next = null;
    }
}

class StudentLinkedList {
    Student head;

    StudentLinkedList() {
        head = null;
    }
    
    public void insert(int rollno, String name, String email , double percentage) {
        Student newstStudent = new Student(rollno,name,email,percentage);
        if(head == null){
            head = newstStudent;
        }
        else{
            Student temp = head;
            newstStudent.next = temp;
            head = newstStudent;
            System.out.println("Value inserted successfully");
        }
    }
    
    public void insertAtLast(int rollNo, String name, String email, double percentage) {
       //object of the student class
        Student newStudent = new Student(rollNo, name, email, percentage);

        if (head == null) {
            head = newStudent;
        } else {
            Student current = head;   // making the student type variable = current
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
        }
    }

    public void insertAtPosition(int position, int rollNo, String name, String email, double percentage) {
        if (position < 1) {
            System.out.println("Invalid position. Position should be greater than or equal to 1.");
            return;
        }
        //object of the student class
        Student newStudent = new Student(rollNo, name, email, percentage);

        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
        } else {
            Student current = head;
            int count = 1;
            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Invalid position. Position is out of range.");
            } else {
                newStudent.next = current.next;
                current.next = newStudent;
            }
        }
    }

    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        Student current = head;
        while (current.next != null && current.next.rollNo != rollNo) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Student with roll number " + rollNo + " not found.");
        }
    }

    public void displayAllStudents() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            Student current = head;
            System.out.println("Roll No\tName\tEmail\tPercentage");
            while (current != null) {
                System.out.println(current.rollNo + "\t" + current.name + "\t" + current.email + "\t" + current.percentage);
                current = current.next;
            }
        }
    }
}

public class linked_list_stud {
    public static void main(String[] args) {

        StudentLinkedList studentList = new StudentLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Record Management System");

            System.out.println("0. Insert at Begining");
            System.out.println("1. Insert at Last");
            System.out.println("2. Insert at Position");
            System.out.println("3. Delete by Roll No");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

            switch (choice) {

                case 0:
                    System.out.print("Enter Roll No: ");
                    int rollNo = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Percentage: ");
                    double percentage = scanner.nextDouble();
                    studentList.insert(rollNo,name,email,percentage);
                    System.out.println("Student record added successfully.");
                    break;
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo1 = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Name: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email1 = scanner.nextLine();
                    System.out.print("Enter Percentage: ");
                    double percentage1 = scanner.nextDouble();
                    studentList.insertAtLast(rollNo1, name1, email1, percentage1);
                    System.out.println("Student record added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Position: ");
                    int position = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Roll No: ");
                    rollNo = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    email = scanner.nextLine();
                    System.out.print("Enter Percentage: ");
                    percentage = scanner.nextDouble();
                    studentList.insertAtPosition(position, rollNo, name, email, percentage);
                    System.out.println("Student record added at position " + position + " successfully.");
                    break;
                case 3:
                    System.out.print("Enter Roll No to Delete: ");
                    rollNo = scanner.nextInt();
                    studentList.deleteByRollNo(rollNo);
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    scanner.close();
            }
        }
    }
}

*/

class student{
    int rno;
    String name;
    student next;

    student(int rno,String name){
        this.rno = rno;
        this.name = name;
        this.next = null;
    }
}

class studentList{
    student head = null;
    
    public void insert(int rno,String name) {
        student newstudent = new student(rno, name);

        if(head == null){
            head = newstudent;
        }
        newstudent.next = head;
        head = newstudent;
    }
    // insert at last
    public void insertAtLast(int rno,String name) {
        student newstStudent = new student(rno, name);
        if(head == null){
            head = newstStudent;
        }
        student temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newstStudent;
        
    }
    // insert at given position
    public void insertatpos(int pos,int rno,String name) {
        student newstStudent = new student(rno, name);
        if(pos < 1){
            System.out.println("Invalid Positon");
        }
        if(pos == 1){
            insert(rno, name);
        }
        student temp = head;
        int cnt =1;

        while(temp != null && cnt < pos-1){
            temp = temp.next;
            cnt++;
        }
        if(temp == null){
            System.out.println("Invalid position");

        }else{
            newstStudent.next = temp.next;
            temp.next = newstStudent;

        }
        
    }
    // display
    public void display() {
        student temp = head; 
        if(temp == null){
            System.out.println("no data found");
        }else{
            System.out.println("Rollno \t Name");
           while(temp != null){
                System.out.println(temp.rno + "\t" + temp.name);
                temp = temp.next;
            }
        }
    }
            
}
public class linked_list_stud{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentList stdl = new studentList();
        int rno,ch,pos;
        String name;
        boolean flag = true;

        while(flag){
                System.out.println("1.Insert");
                System.out.println("2.Insert at the Last");
                System.out.println("3.Insert at the Position");
                System.out.println("4.Display");
                System.out.println("5.Exit");
                System.out.println("Enter the choise: ");
                ch = sc.nextInt();
                switch(ch){
                    case 1:
                            System.out.println("Enter the roll no: ");
                            rno = sc.nextInt();
                            System.out.println("Enter the name: ");
                            name = sc.next();
                            stdl.insert(rno, name);
                            break;
                    case 2:
                            System.out.println("Enter the roll no: ");
                            rno = sc.nextInt();
                            System.out.println("Enter the name: ");
                            name = sc.nextLine();
                            stdl.insertAtLast(rno, name);
                            break;
                    case 3:
                            System.out.println("Ente the Position: ");
                            pos = sc.nextInt();
                            System.out.println("Enter the roll no: ");
                            rno = sc.nextInt();
                            System.out.println("Enter the name: ");
                            name = sc.nextLine();
                            stdl.insertatpos(pos, rno, name);
                            break;

                    case 4:
                            stdl.display();
                            break;
                    case 5:
                            System.out.println("You choose exit");
                            flag = false;
                            break;
                    default:
                            System.out.println("Invalid choise...");
                            break;
                }
        }       
        sc.close();
    }
}