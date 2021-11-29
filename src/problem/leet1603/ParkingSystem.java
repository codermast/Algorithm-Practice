package problem.leet1603;

public class ParkingSystem {
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType){
            case 1:
                if(big > 0){
                    big --;
                    return true;
                }
                return false;
            case 2:
                if(medium > 0){
                    medium --;
                    return true;
                }
                return false;
            case 3:
                if(small > 0){
                    small --;
                    return true;
                }
                return false;
            default:
                return false;
        }

    }
}
