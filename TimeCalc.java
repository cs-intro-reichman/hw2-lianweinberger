public class TimeCalc {
    public static void main(String[] args) {        
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMintues = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMintues / 60;
        int newHours = totalHours % 24;
        int newMintues = totalMintues - (totalHours * 60);
		String minutesText = newMintues < 10 ? "0" + newMintues : "" + newMintues;
        String hoursText = newHours < 10 ? "0" + newHours : "" + newHours;
        System.out.println(hoursText + ":" + minutesText);
	}
}
