package com.crossbridge.toys.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.crossbridge.toys.util.AppUtil;

@Service
public class ToysService {
	
	public static HashMap<String,Integer> toysPrice = null;
	public static HashMap<String,Integer> toysPresent = null;


int cost[] = {1, 12, 5, 111, 200, 
        1000, 10, 9, 12, 15}; 
	
	static {
		toysPresent = new HashMap<String, Integer>();
		toysPresent.put("A", 1);
		toysPresent.put("B", 10);
		toysPresent.put("C", 5);
		toysPresent.put("D", 3);
		toysPresent.put("E", 0);

		toysPrice = new HashMap<String, Integer>();
		toysPrice.put("A", 5);
		toysPrice.put("B", 1);
		toysPrice.put("C", 3);
		toysPrice.put("D", 2);
		toysPrice.put("E", 8);
	}

	public String calculateMaxNoOfToys(Integer rupees) {
		Map<String, Integer> sortedPrice = AppUtil.sortByValue(AppUtil.toysPrice);
		int count = 0;
		int left = rupees;
		StringBuilder retStr =  new StringBuilder();
		for (Entry<String, Integer> entry : sortedPrice.entrySet()) {
			int price = entry.getValue();
			int toysCount = AppUtil.toysPresent.get(entry.getKey());
			String toy = entry.getKey();
			left = left - (toysCount * price);
			if(left == 0) {
				count = count + toysCount;
				retStr.append(" Toy : "+toy + " Cnt : "+toysCount + "("+price+"),");
				break;
			} else if(left > 0 ) {
				retStr.append(" Toy : "+toy + " Cnt : "+toysCount + "("+price+"),");
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
				retStr.append(" Toy : "+toy + " Cnt : "+lclCnt + "("+price+"),");
			}
			
		}
		retStr.append(" Total count : "+count);
		return retStr.toString();
	}

}
