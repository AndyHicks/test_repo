public class StatsOnly4
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

        System.out.println("Number of Statistics students in the class: " + numberOfStatsStudents);
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

        System.out.println("\nThe students only in Statistics:");
        count = 0;
        for (String statName : statsStudents)
        {
            boolean isStatsOnly = true;
            for (String name : statsAndCalc)
            {
                if (statName == name)
                {
                    isStatsOnly = false;
                }
            }
            if (isStatsOnly)
            {
                statsOnly[count] = statName;
                count++;
                System.out.println(count + ". " + statsOnly[count - 1]);
            }
        }

        
    }
}
