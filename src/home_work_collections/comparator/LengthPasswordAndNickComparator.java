package home_work_collections.comparator;

import home_work_collections.dto.Person;

import java.util.Comparator;

public class LengthPasswordAndNickComparator implements Comparator <Person> {

   @Override
    public int compare(Person p1, Person p2) {
       //int resultCompareLengthPassword = new LengthPasswordComparator().compare(p1,p2);
       int resultCompareLengthPassword = p1.getPassword().length() - p2.getPassword().length();

       int resultCompareNick = p1.getNick().compareTo(p2.getNick());

       if(resultCompareLengthPassword == 0) {

           if(resultCompareNick == 0) {
               return 0;
           } else {
               if (resultCompareNick > 0) {
                   return 1;
               } else {
                   return -1;
               }
           }

       } else {

           if (resultCompareLengthPassword > 0) {
               return 1;
           } else {
               return -1;
           }
       }
    }
}
