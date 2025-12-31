import java.util.Scanner;
public class QuizApplication{
    public static String question(int index){
        String [] question= new String[5];
        question[0]= "Which is a primitive data type in Java?";
        question[1]= "File extension of Java source file?";
        question[2]="Which of the following is used to control version history in software development?";
        question[3]="Which data structure uses FIFO (First In First Out)?";
        question[4]= "Loop that runs at least once?";
        return  question[index];
    }

    public static String[][] options() {
        return new String[][] {
            {"A. String", "B. int", "C.ArrayList ", "D. Object"},
            {"A. .class", "B. .exe", "C. .java", "D. .txt"},
            {"A. Git", "B. HTTP", "C. Docker", "D. SQL"},
            {"A. Stack", "B. Queue", "C. Tree" ,"D. Graph"},
            {"A. for", "B. while", "C. do-while", "D. switch"},
        };
    }

    public static void main(String[] args) {
        try(Scanner input=new Scanner(System.in)){
            String [][] options = options();
            String []correctAnswer = { "B" ,  "C" , "A" , "B", "C" };
            String [] userAnswer = new String[5];
            int score =0;
            System.out.println ("-------------------------------------------");
            System.out.println ("Welcome To Online Quiz Application");
            
            for(int i=0; i<5; i++){
                System.out.println("Q"+(i+1)+ " "+question(i));
                System.out.println("Options are:");
                for(int j = 0; j < options[i].length; j++) {
                    System.out.println(options[i][j]);
                }
                System.out.println("Please select Option: ");
                userAnswer[i] = input.next().toUpperCase();
                
                if(userAnswer[i].equalsIgnoreCase(correctAnswer[i])){
                    score++;
                    System.out.println("Correct answer!");
                } else {
                    System.out.println("Wrong answer!");
                }
            }
            System.out.println ("-------------------------------------------");
            System.out.println("*********You Scored "+score+"/5**********");
        }
    }
}





