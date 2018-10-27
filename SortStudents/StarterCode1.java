public class StarterCode1
{
    public static void main(String[] args)
    {
        String[] statsStudents = new String[] {"Adam", "Alex", "Brayden", "Brett", "Brock", "Carter",
                "Catherine", "Christine", "Emily", "Hannah", "Herman", "Hunter", "Jeffrey", "Kari", "Katelyn",
                "Madison","Martha","Matthew","Ryan","Rylee","Sergio","Shelby","Stephen","Sutton",
                "Tevyn", "Valerie", "Zachary"};

        String[] calcStudents = new String[] {"Stephen", "Hannah", "Brock", "Brayden", "Kari", "Ryan",
                "Sergio", "Catherine", "Katelyn", "Matthew", "Jeffrey", "Sutton", "Brett", "Adam", "Madison",
                "Rylee","Tevyn","Joy","Kallie","Sophia","Emma","John","Paul","Victoria","Margaret",
                "Dylan", "Cynthia", "Reese", "Bryce", "Jillian"};

        int numberOfStatsStudents = statsStudents.length;
        int numberOfCalcStudents = calcStudents.length;
        int maximumStudentsPossible = (int) Math.max(numberOfStatsStudents, numberOfCalcStudents);
        int minimumStudentsPossible = (int) Math.min(numberOfStatsStudents, numberOfCalcStudents);

        // define new empty Arrays
        String[] statsOnly = new String[maximumStudentsPossible];
        String[] calcOnly = new String[maximumStudentsPossible];
        String[] statsAndCalc = new String[minimumStudentsPossible];

        System.out.println("Number of Statistics students: " + numberOfStatsStudents);
        System.out.println("\nNumber of Calculus students: " + numberOfCalcStudents);
        System.out.println("\nMaximum number of students possible in EITHER class: " + maximumStudentsPossible);
        System.out.println("\nMaximum number of students possible in BOTH classes: " + minimumStudentsPossible);
        
    }
}
