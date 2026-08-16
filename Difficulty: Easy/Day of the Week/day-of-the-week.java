class Solution {
	public String getDayOfWeek(int[] date) {
		
		String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year = date[2];
		int month = date[1];
		
		// on 1 jan 1971 day was friday so previous day was Thursday so i took it
		int sum = 0;
		
		
		// calculate days of all years
		for (int i = 1; i<year; i++) {
			if ((i%4 == 0 && i%100 != 0) || (i%400 == 0)) {
				sum = sum + 366;
			} else {
				sum = sum + 365;
			}
		}
		
		// add month days
		for (int i = 0; i < month - 1; i++) {
			
			if (i == 1 && ((year%4 == 0 && year%100 != 0) || year%400 == 0))
				sum = sum + months[i]+1;
			else
				sum = sum + months[i];
			
		}
		// add days
		sum = sum + date[0];
		// calculte week day
		String weekOfTheDay = days[sum%7];
		return weekOfTheDay;
	}
	
}
