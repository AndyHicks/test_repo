public class SortStudentsBoolean
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
        int minimumStudentsPossible = (int) Math.min(numberOfStatsStudents, numberOfCalcStudents);

        // define two boolean Arrays, initially with all values set to false
        boolean[] statsAlsoInCalc = new boolean[numberOfStatsStudents];
        boolean[] calcAlsoInStats = new boolean[numberOfCalcStudents];

        // define new empty Arrays
        String[] statsOnly = new String[numberOfStatsStudents];
        String[] calcOnly = new String[numberOfCalcStudents];
        String[] statsAndCalc = new String[minimumStudentsPossible];

        System.out.println("Number of Statistics students: " + numberOfStatsStudents);
        System.out.println("\nNumber of Calculus students: " + numberOfCalcStudents);

        // Print inital values
        int count = 0;
        for (int i = 0; i < numberOfStatsStudents; i++)
        {
            for (int j = 0; j < numberOfCalcStudents; j++)
            {
                if (statsStudents[i] == calcStudents[j])
                {
                    System.out.println((count + 1) + ". " + statsStudents[i]);
                    // put the three statments here
                    count++;
                }
            }
        }

    }
}
