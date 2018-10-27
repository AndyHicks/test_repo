public class TwoLists2
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
        int totalStudentsPossible = numberOfStatsStudents + numberOfCalcStudents;

        // define new empty Arrays
        String[] statsOnly = new String[totalStudentsPossible];
        String[] calcOnly = new String[totalStudentsPossible];
        String[] statsAndCalc = new String[totalStudentsPossible];

        System.out.println("Number of Statistics students: " + numberOfStatsStudents);
        int count = 1;
        for (String statsName : statsStudents)
        {
            System.out.println(count + ". " + statsName);
            count++;
        }

        System.out.println("\nNumber of Calculus students: " + numberOfCalcStudents);
        count = 1;
        for (String calcName : calcStudents)
        {
            System.out.println(count + ". " + calcName);
            count++;
        }
    }
}
