package leetcode1184;

public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if (start > destination) {
            return distanceBetweenBusStops(distance, destination, start);
        }

        int clockWise = 0;
        int counterClockwise = 0;

        // 计算顺时针
        int i = start;
        while (i != destination) {
            clockWise += distance[i];
            i++;
        }

        // 计算逆时针
        i = start;
        while (i != destination) {
            i = (i - 1 + distance.length)  % distance.length;
            counterClockwise += distance[i];
        }

        return Math.min(clockWise, counterClockwise);
    }

    public static void main(String[] args) {
        DistanceBetweenBusStops instance = new DistanceBetweenBusStops();

        int[] arr = {7,10,1,12,11,14,5,0};
        System.out.println(instance.distanceBetweenBusStops(arr, 7, 2));
    }
}
