package labproject2.prob1;

public class TestWeeklyTemps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WeeklyTemps lastWeek = new WeeklyTemps();
double[] temps = new double[]{1, 50, 60, 75, 15, 110, 91};
System.out.println("Weekly temperatures data(degrees F)");
System.out.printf( " mean: %.1f", lastWeek.getMean(temps));
System.out.println();
System.out.println("range: " + lastWeek.getRange(temps));
System.out.println("extreme temp days: " + lastWeek.getExtreme(temps));
	}

}
