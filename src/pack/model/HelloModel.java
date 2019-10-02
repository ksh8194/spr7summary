package pack.model;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class HelloModel {
	public String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 6 && hour <= 11) {
			return "좋은 아침";
		}else if(hour >= 12 && hour <= 15) {
			return "좋은 점심";
		}else if(hour >= 18 && hour <= 22) {
			return "좋은 저녁";
		}else {
			return "안녕하세요";
		}

	}
}
