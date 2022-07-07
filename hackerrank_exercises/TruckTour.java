package hckrnk_exercises;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    int totalPetrolStations = scanner.nextInt();
    long[][] stations_litersAndDistanceToNext = new long[totalPetrolStations][2];

    for (int i = 0; i < totalPetrolStations; i++) {
      long liters = scanner.nextLong();
      long distanceToNextStation = scanner.nextLong();

      stations_litersAndDistanceToNext[i][0] = liters;
      stations_litersAndDistanceToNext[i][1] = distanceToNextStation;
    }
    scanner.close();

    int minStartIndex_toCompleteTruckTour = search_minStartIndex_toCompleteTruckTour(stations_litersAndDistanceToNext);
    System.out.println(minStartIndex_toCompleteTruckTour);
  }


  /**
   * The method searches for the minimum starting index, from which the truck can make a complete
   * tour of the petrol stations, i.e. starting index = finishing index, and the next petrol station
   * to be visited is the petrol station with the next index in the array, in increasing order. 
   * The exception to this order is only when the current index equals the last array index: 
   * then the next station to be visited is that with index zero.
   *
   * @return A non-negative integer, if there is an index, as described above. 
   *         Otherwise, it returns '-1'.    
   */
  public static int search_minStartIndex_toCompleteTruckTour(long[][] stations_litersAndDistanceToNext) {
      
       int totalStarts = stations_litersAndDistanceToNext.length;
       int index = 0;
       
      while (totalStarts > 0) {
      int start = index;
      long litersInTruck = stations_litersAndDistanceToNext[index][0] - stations_litersAndDistanceToNext[index][1];
      boolean completeTour = false;
      totalStarts--;

        while (litersInTruck >= 0) {
        index = (index + 1) % stations_litersAndDistanceToNext.length;
        if (index == start) {
          completeTour = true;
          break;
        }

        litersInTruck += stations_litersAndDistanceToNext[index][0]- stations_litersAndDistanceToNext[index][1];              
      }

      if (completeTour) {
        return start;
      }
      index = (index + 1) % stations_litersAndDistanceToNext.length;
    }

    return -1;
  }
}
