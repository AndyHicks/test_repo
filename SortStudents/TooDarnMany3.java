public class TooDarnMany3
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
        String[] statsOnly = new String[1000];
        String[] calcOnly = new String[maximumStudentsPossible];
        String[] statsAndCalc = new String[minimumStudentsPossible];

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

        System.out.println("\nStudents in both Statistics and Calculus:");
        count = 0;
        for (String statName : statsStudents)
        {
            for (String calcName : calcStudents)
            {
                if (statName == calcName)
                {
                    statsAndCalc[count] = statName;
                    count++;
                }
            }
        }

        count = 1;
        for (String name : statsAndCalc)
        {
            if (name != null) // replace with name != null to exclude null values of the Array
            {System.out.println(count + ". " + name);
            }
            count++;
        }

        System.out.println("\nLooking for students only in Statistics:");
        count = 0;
        int statsOnlyCount = 0;
        for (String statName : statsStudents)
        {
            for (String name : statsAndCalc)
            {
                System.out.print((count + 1) + ".  Stats: " + statName + " ,  Both: " + name);
                count++;
                if (statName == name)
                {
                    System.out.println(" - HEY! THIS KID IS IN BOTH CLASSES! NOT STATS ONLY");
                }
                else
                {
                    statsOnly[statsOnlyCount] = statName;
                    statsOnlyCount++;
                    System.out.println();
                }
            }

        }
        
        System.out.println("\nThe students only in Statistics:");
        count = 1;
        for (String name : statsOnly)
        {
            if (name != null) // replace with name != null to exclude null values of the Array
            {System.out.println(count + ". " + name);
            }
            count++;
        }
    }
}
