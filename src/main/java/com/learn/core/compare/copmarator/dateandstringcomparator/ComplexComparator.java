package com.learn.core.compare.copmarator.dateandstringcomparator;

import java.util.Comparator;
import org.apache.commons.lang.StringUtils;

/**
 * Created by IntelliJ IDEA.
 * User: bilyk
 * Date: 07.05.12
 * Time: 15:27
 * To change this template use File | Settings | File Templates.
 */
public class ComplexComparator implements Comparator<Human> {

    public int compare(Human o1, Human o2)
	 {

//		 if(o1.getBusinessPartnerId().compareTo(o2.getBusinessPartnerId()) == 0){
//			 return o1.getBirthDate().after(o2.getBirthDate()) ? 1 : -1;
//		 }else{
//			 if((o1.getBirthDate().after(o2.getBirthDate())?1:-1)>0){
//				 return 1;
//			 }else{
//				 return -1;
//			 }
//		 }



		 if (StringUtils.isNotEmpty(o1.getBusinessPartnerId()) && StringUtils.isEmpty(o2.getBusinessPartnerId())){
			 return -1;
		 }
		 if (StringUtils.isEmpty(o1.getBusinessPartnerId()) && StringUtils.isNotEmpty(o2.getBusinessPartnerId())){
			 return 1;
		 }

		 if(o1.getBirthDate() != null && o2.getBirthDate() != null){
			 if (StringUtils.isNotEmpty(o1.getBusinessPartnerId()) && StringUtils.isNotEmpty(o2.getBusinessPartnerId()))
			 {
				 return o1.getBirthDate().before(o2.getBirthDate()) ? 1 : -1;
			 }

			 if (StringUtils.isEmpty(o1.getBusinessPartnerId()) && StringUtils.isEmpty(o2.getBusinessPartnerId()))
			 {
				 return o1.getBirthDate().before(o2.getBirthDate()) ? 1 : -1;
			 }
		 }

		 return 0;
	 }
}
