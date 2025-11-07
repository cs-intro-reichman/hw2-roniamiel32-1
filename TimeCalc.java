public class TimeCalc {
    public static void main(String[] args) {
        char var = args[0].charAt(0);
        int var1 = Integer.parseInt("" + var + args[0].charAt(1));
        var = args[0].charAt(3);
        int var2 = Integer.parseInt("" + var + args[0].charAt(4));

        int minToAdd = Integer.parseInt(args[1]);
        int totalMin = var1 * 60 + var2 + minToAdd;
        int totalHour = totalMin / 60;
        int newHour = totalHour % 24;
        int newMin = totalMin - (totalHour * 60);

        if (newHour >= 10 && newMin >= 10) System.out.println(newHour  + ":" + newMin);
        else if (newHour >= 10 && newMin < 10) System.out.println(newHour  + ":0" + newMin);
        else if (newHour < 10 && newMin >= 10) System.out.println("0" +newHour  + ":" + newMin);
        else if (newHour < 10 && newMin < 10) System.out.println("0" + newHour  + ":0" + newMin);
    }
}
