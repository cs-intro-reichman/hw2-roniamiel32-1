// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	int num = Integer.parseInt(args[0]);
	double sum = 0;
	for (int i = 0; i < num; i++) {
		double temp = 1.0 / (i *2 + 1);
		if (i % 2 != 0) {
			sum = sum - temp;
		} else {
			sum = sum + temp;
		}
		}
		double calcPi = 4 * sum;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + calcPi);
	}

	}

