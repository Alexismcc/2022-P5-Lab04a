public class Lab04am

{
        public static void main(String[] args) {
            System.out.println("Lab04a, Student Version\n");

            double principal = 250000;
            double annualRate = 4.85;
            double numYears = 30;
            double monthRate = (annualRate/100) / 12;
            double numMonths = numYears * 12;
            double numerator = monthRate * Math.pow(1+monthRate,numMonths);
            double denomitor = Math.pow(1+monthRate,numMonths) - 1;
            double monthlyPayment = (numerator/denomitor) * principal;
            double totalPayments = 474922.64481386304;
            double interse = totalPayments % (monthlyPayment * numMonths);


            System.out.println("principal :             " + principal);
            System.out.println("Annual Rate :           " + annualRate);
            System.out.println("Number of years :       " + numYears);
            System.out.println("Monthly Payment :       " + monthlyPayment);
            System.out.println("Total Payments :        " + totalPayments);
            System.out.println("Total Interest :        " + interse);





        }
}
