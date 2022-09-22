package home_work_collections.comparator;



import home_work_collections.dto.Animal;

import java.util.Comparator;

public class AgeAnimalAndNickComparator implements Comparator <Animal> {

   @Override
    public int compare(Animal a1, Animal a2) {
       int resultAgeCompare = a1.getAge() - a2.getAge();
       int resultNickCompare = a1.getNick().compareTo(a2.getNick());

       if(resultAgeCompare == 0){
           if(resultNickCompare == 0) {
               return 0;
           } else {
               if (resultNickCompare > 0) {
                   return 1;
               } else {
                   return -1;
               }
           }
       } else {
           if (resultAgeCompare > 0) {
               return 1;
           } else {
               return -1;
           }
       }
   }
}
