import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;

public class Student {
  // attribute of your chooice but all attributes must be private
  String name;
  String Age;
  static HashMap<String, Integer> result = new HashMap<String, Integer>();

  public Student() {
    this.name = "";
    this.Age = "";
  }

  public Student(String name, String Age) {
    this.name = name;
    this.Age = Age;
  }

  public Student(String name, String Age, HashMap<String, Integer> result) {
    this.name = name;
    this.Age = Age;
  }

  public void AddResult(String Subject, Integer Marks) {
    Student.result.put(Subject, Marks);
  }

  public HashMap<String, Character> GetGrades() {
    HashMap<String, Character> grades = new HashMap<String, Character>();
    for (Entry<String, Integer> course : result.entrySet()) {
      Character grade;
      Integer marks = course.getValue();
      if (marks >= 80) {
        grade = 'A';
      } else if (marks >= 70) {
        grade = 'B';
      } else if (marks >= 60) {
        grade = 'C';
      } else if (marks >= 50) {
        grade = 'D';
      } else {
        grade = 'F';
      }
      grades.put(course.getKey(), grade);
    }
    return grades;
  }

  public Double GetCgpa() {
    Double ch = 0.0;
    Integer total_cd = 0;
    for (Entry<String, Integer> course : result.entrySet()) {
      Integer marks = course.getValue();
      if (marks >= 80) {
        ch += 4 * 3;
        total_cd += 3;
      } else if (marks >= 70) {
        ch += 3.5 * 3;
        total_cd += 3;
      } else if (marks >= 60) {
        ch += 3.0 * 3;
        total_cd += 3;
      } else if (marks >= 50) {
        ch += 2.5 * 3;
        total_cd += 3;
      } else {
        ch += 1.0 * 3;
        total_cd += 3;
      }
    }
    return (ch / total_cd);
  }

  public static void main(String[] args) {
    Student s = new Student("Ali", "22");
    s.AddResult("Eng", 90);
    s.AddResult("Urdu", 70);
    s.AddResult("Math", 60);
    System.out.println("---------------------------");
    System.out.println("Your CGPA is " + s.GetCgpa());
    System.out.println("---------------------------");

    s.GetGrades();
    HashMap<String, Character> grades = s.GetGrades();
    ArrayList<String> sub = new ArrayList<String>(); // For Store Subject
    ArrayList<Character> grd = new ArrayList<Character>(); // For store Subject Grades
    System.out.println("Your Grades");
    for (String i : grades.keySet()) {

      sub.add(i);
    }
    for (Character i : grades.values()) {

      grd.add(i);
    }
    System.out.println("---------------------------");
    System.out.println("Subject" + "         " + "Grade");
    System.out.println("---------------------------");

    for (Integer i = 0; i < sub.size(); i++) {
      System.out.println(sub.get(i) + "         " + grd.get(i));
    }

    // for (Entry<String, Character> entry : grades.entrySet()) {
    // System.out.println(entry.getKey() + " " + entry.getValue());
    // }
  }
}
