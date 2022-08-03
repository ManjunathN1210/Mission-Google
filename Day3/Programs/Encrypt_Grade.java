package Day3.Programs;

public class Encrypt_Grade {
    public static void main(String[] args) {
        
        //Encrypt the grade
        char grade = 'B';
        grade = (char) (grade + 8);

        System.out.println(grade);

        //Decrypt the grade
        grade = (char) (grade - 8);
        
        System.out.println(grade);
    }
}
