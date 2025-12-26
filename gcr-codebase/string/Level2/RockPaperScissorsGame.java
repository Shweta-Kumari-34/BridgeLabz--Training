import java.util.Scanner;
//creating a class with name as RockPaperScissorsGame
public class RockPaperScissorsGame {

// Method to get computer choice
public static String getComputerChoice() {
int num = (int)(Math.random() * 3); // 0,1,2
if(num == 0) return "Rock";
else if(num == 1) return "Paper";
else return "Scissors";
}

// Method to decide who is winner
public static String getWinner(String user, String comp) {
if(user.equalsIgnoreCase(comp)) return "Draw";
if(user.equalsIgnoreCase("Rock") && comp.equals("Scissors")) return "Player";
if(user.equalsIgnoreCase("Scissors") && comp.equals("Paper")) return "Player";
if(user.equalsIgnoreCase("Paper") && comp.equals("Rock")) return "Player";

return "Computer";
}

// Method to calculate stats & return a 2D string array
public static String[][] getStats(int playerWins, int compWins, int games) {
String[][] result = new String[2][3];

double playerPercent = (playerWins * 100.0) / games;
double compPercent   = (compWins * 100.0) / games;

result[0][0] = "Player";
result[0][1] = String.valueOf(playerWins);
result[0][2] = String.format("%.2f", playerPercent) + "%";
result[1][0] = "Computer";
result[1][1] = String.valueOf(compWins);
result[1][2] = String.format("%.2f", compPercent) + "%";

return result;
    }

// Method to display result table
public static void displayResults(String[][] history, int count, String[][] stats) {
System.out.println("---- Game Results ----");
System.out.printf("%-10s %-12s %-12s %-10s\n","Game","Player","Computer","Winner");
System.out.println("------------------------------------------------------");
for(int i=0;i<count;i++){
System.out.printf("%-10s %-12s %-12s %-10s\n",
(i+1), history[i][0], history[i][1], history[i][2]);
}

System.out.println("\n---- Final Stats ----");
System.out.printf("%-12s %-10s %-10s\n","Name","Wins","Win %");
System.out.println("----------------------------------");
for(int i=0;i<2;i++){
System.out.printf("%-12s %-10s %-10s\n",stats[i][0], stats[i][1], stats[i][2]);
}
}

// Main method
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter number of games to play: ");
int games = sc.nextInt();
sc.nextLine();  // consume newline
String[][] gameHistory = new String[games][3];
int playerWins = 0, compWins = 0;

for(int i=0;i<games;i++){
System.out.print("\nEnter your choice (Rock/Paper/Scissors): ");
String userChoice = sc.nextLine();
String compChoice = getComputerChoice();
String winner = getWinner(userChoice, compChoice);

if(winner.equals("Player")) playerWins++;
else if(winner.equals("Computer")) compWins++;

gameHistory[i][0] = userChoice;
gameHistory[i][1] = compChoice;
gameHistory[i][2] = winner;
}
String[][] stats = getStats(playerWins, compWins, games);

//calling method to display the result
displayResults(gameHistory, games, stats);

sc.close();
}
}
