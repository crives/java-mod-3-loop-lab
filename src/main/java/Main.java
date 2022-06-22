public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear + 1;
        while (currentYear < targetYear) {
            System.out.println((currentYear - startingYear) + " year(s) have passed");
            // conditional logic based on the current year
            currentYear++;
        }

        // Extension: (Uncomment this and comment out the while loop above to avoid variable overriding)
        // for (int i = startingYear; i < targetYear; i++) {
        //     System.out.println((currentYear - startingYear) + " year(s) have passed");
        //     currentYear++;
        // }
    }
}
