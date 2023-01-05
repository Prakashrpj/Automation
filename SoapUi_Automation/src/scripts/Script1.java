package scripts;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class Script1 {
	public static void main(String[] args) {
		CountryInfoService c = new CountryInfoService();
		CountryInfoServiceSoapType s = c.getCountryInfoServiceSoap();
		String capitalCity = s.capitalCity("IN");
		System.out.println(capitalCity);
	}

}
