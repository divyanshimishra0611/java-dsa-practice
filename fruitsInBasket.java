import java.util.*;
class fruitsInBasket {

    public int totalFruit(int[] fruits) {

        HashMap <Integer, Integer> map = new HashMap<>();

    int low =0;
    
    int totalFruits = Integer.MIN_VALUE;

    for(int high =0; high< fruits.length; high++){
        
        int fruitType = fruits[high];
        map.put(fruitType, map.getOrDefault(fruitType,0)+1);

        while(map.size()>2){
            int fruitRem = fruits[low];
            map.put(fruitRem, map.get(fruitRem)-1);
            
            if(map.get(fruitRem)==0){
                map.remove(fruitRem);
            }
            low++;
        }
        int currentFruits = high-low+1;
        totalFruits = Math.max(currentFruits, totalFruits);
    }
    return totalFruits;
        
    }
    public static void main(String args[]){
        fruitsInBasket fBasket = new fruitsInBasket();

        int[] fruits = {1,2,1};
        System.out.println(fBasket.totalFruit(fruits));
    }
} 
  

