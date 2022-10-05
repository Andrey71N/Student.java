package lesson3;

public class Student {
    int studentid;
    String name;
    String surname;
    int yeareEducation;
    double mathScore;
    double economicsAssessment ;
    double foreignLanguageAssessment;

   }


   class  StudentTest{
       public static void main(String[] args) {

        Student st1 = new Student();

           st1.studentid = 1;
           st1.name = "Andrey";
           st1.surname ="Golikov";
           st1.yeareEducation = 2;
           st1.mathScore = 3.2;
           st1.economicsAssessment =1.3;
           st1.foreignLanguageAssessment = 2.4;

            Student st2 = new Student();

            st2.studentid = 2;
            st2.name = "Vano";
            st2.surname = "Dgavaev";
            st2.yeareEducation = 3;
            st2.mathScore = 4.2;
            st2.economicsAssessment =3.2;
            st2.foreignLanguageAssessment = 1.7;


            Student st3 =new Student();

           st3.studentid = 2;
           st3.name = "Daha";
           st3.surname = "Bochkareva";
           st3.yeareEducation = 2;
           st3.mathScore = 1.2;
           st3.economicsAssessment =2.2;
           st3.foreignLanguageAssessment = 3.7;


           System.out.println( "Средняя стенка студента" + " " + st1.name + " " + st1.surname + " " + "=" + " " +  ( st1.mathScore + st1.economicsAssessment + st1.foreignLanguageAssessment)/3);
           System.out.println( "Средняя стенка студента" + " " + st2.name + " " + st2.surname + " " + "=" + " " +  ( st2.mathScore + st2.economicsAssessment + st2.foreignLanguageAssessment)/3);
           System.out.println( "Средняя стенка студента" + " " + st3.name + " " + st3.surname + " " + "=" + " " +  ( st3.mathScore + st3.economicsAssessment + st3.foreignLanguageAssessment)/3);






       }






   }



















