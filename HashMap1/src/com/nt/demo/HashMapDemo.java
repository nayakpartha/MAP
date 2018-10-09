package com.nt.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("jitu",100);
		hm.put("dudul", 200);
		hm.put("hpy", 300);
		System.out.println(hm);
		hm.put("hpy", 400);
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		Collection c=hm.values();
		System.out.println(c);
		Set s1=hm.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while (itr.hasNext()) {
		Map.Entry hm1=(Entry) itr.next();
		System.out.println(hm1.getKey()+".."+hm1.getValue());
			//Object object = (Object) itr.next();
		if (hm1.getKey().equals("hpy")) {
			hm1.setValue(500);
			
		}
		System.out.println(hm);
			
		}
		

	}

}
