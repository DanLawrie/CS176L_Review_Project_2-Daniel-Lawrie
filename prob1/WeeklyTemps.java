package labproject2.prob1;

public class WeeklyTemps {
double max;

	public static void main(String[] args) {
		

	}
	public double getMax(double[] temps)
	{
		double max = 0;
		for(int i =  0; i< temps.length; i++)
		{
			if (temps[i]>max) {
				max = temps[i];
			}
		}
		return max;
	}
	public double getMin(double[] temps)
	{
		double min = temps[0];
		for(int i =  0; i< temps.length; i++)
		{
			if (temps[i]<min) {
				min = temps[i];
			}
		}
		return min;
	}
	public String getRange(double[] temps) {
		String range = getMin(temps) + " - "+ getMax(temps);
		
		return range;
	}
	public double getMean(double[] temps) {
		double sum = 0;
		
		for(int i =  0; i< temps.length; i++) {
			sum += temps[i];
			
		}
		double mean = sum /temps.length;
		return mean;
		
	}

	public int getExtreme(double[] temps) {
		int count = 0;
		for(int i =  0; i< temps.length; i++) {
			if(temps[i]<5 || temps[i] >= 95)
			{
				count++;
			}
			
		}
		return count;
	}
}
