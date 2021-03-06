package com.learn;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamToMap {
	public static void main(String[] args) {

//		List<FiaskoKiaskoDiscount> fiaskoKiaskoDiscounts = getFiaskoKiaskoDiscounts();

		EnumerationService enumerationService = new EnumerationService();

		Optional<List<FiaskoKiaskoDiscount>> fiaskoKiaskoDiscounts = Optional.ofNullable(getFiaskoKiaskoDiscounts());
		if (fiaskoKiaskoDiscounts.isPresent()) {
			Map<String, String> map = fiaskoKiaskoDiscounts.get().stream().collect
							(Collectors.toMap(FiaskoKiaskoDiscount::getCode, enumerationService::getEnumerationName));

			for (String s : map.keySet()) {
				System.out.println(s);
			}
		}
//		Map<String, String> map = getFiaskoKiaskoDiscounts().stream().collect
//						(Collectors.toMap(FiaskoKiaskoDiscount::getId, enumerationService::getEnumerationName));
//
//		for (String s : map.keySet()) {
//			System.out.println(s);
//		}

	}

	private static List<FiaskoKiaskoDiscount> getFiaskoKiaskoDiscounts() {
		FiaskoKiaskoDiscount fiaskoKiaskoDiscount1 = new FiaskoKiaskoDiscount();
		fiaskoKiaskoDiscount1.setCode("1");
		fiaskoKiaskoDiscount1.setName("name1");
		FiaskoKiaskoDiscount fiaskoKiaskoDiscount2 = new FiaskoKiaskoDiscount();
		fiaskoKiaskoDiscount2.setCode("2");
		fiaskoKiaskoDiscount2.setName("name2");
		return Arrays.asList(fiaskoKiaskoDiscount1, fiaskoKiaskoDiscount2);
//		return null;
	}


}

class FiaskoKiaskoDiscount {
	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class EnumerationService {
	public String getEnumerationName(FiaskoKiaskoDiscount fiaskoKiaskoDiscount) {
		return fiaskoKiaskoDiscount.getName();
	}
}