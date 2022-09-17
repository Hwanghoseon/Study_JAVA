package hiding;

public class MyDate {
	private int year, month, day;
	private boolean isValid = true;
	
	public MyDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void setYear(int yaer) {
		if(year < 0)
			isValid = false;
		else
			this.year = year;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 0 || month > 12)
			isValid = false;
		else
			this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day < 0)
			isValid = false;
		else {
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day > 31) 
					isValid = false;
				break;
			case 4: case 6: case 9: case 11:
				if(day > 30)
					isValid = false;
				break;
			case 2:
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					if(day > 29)
						isValid = false;
				}
				else {
					if(day > 28)
						isValid = false;
				}
				break;
			}
			if(isValid) 
				this.day = day;
		}
	}
	
	public String isValid() {
		if(isValid)
			return "유효한 날짜입니다.";
		else
			return "유효하지 않은 날짜입니다.";
	}
}
