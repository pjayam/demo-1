package com.crossbridge.toys;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crossbridge.toys.service.ToysService;
import com.crossbridge.toys.util.AppUtil;

@SpringBootApplication
public class Demo1Application {
	
	@Autowired
	static
    ToysService service;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		Map<String, Integer> sortedPrice = AppUtil.sortByValue(AppUtil.toysPrice);
		
		int count = 0;
		int left = 25;
		for (Entry<String, Integer> entry : sortedPrice.entrySet()) {
			int price = entry.getValue();
			int toysCount = AppUtil.toysPresent.get(entry.getKey());
			String toy = entry.getKey();
			left = left - (toysCount * price);
			if(left == 0) {
				count = count + toysCount;
				System.out.print(" Toy : "+toy + " Cnt : "+toysCount + "("+price+"),");
				break;
			} else if(left > 0 ) {
				System.out.print(" Toy : "+toy + " Cnt : "+toysCount + "("+price+"),");
				count = count + toysCount;
				continue;
			} else if(left < 0 ){
				left = left + (toysCount * price);
				int lclCnt = 0;
				while (left >= 0) {
					left = left - price;
					if(left >= 0) {
						count++;
						lclCnt++;
					}
					
				}
				System.out.print(" Toy : "+toy + " Cnt : "+lclCnt + "("+price+"),");
			}
		}
		System.out.println(" Total count : "+count);
	}

}
