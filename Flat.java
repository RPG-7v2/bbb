public class Flat {
    private byte roomNum;
    private double roomArea;

    public byte getRoomNum() {
        return roomNum;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomNum(byte roomNum) {
        this.roomNum = roomNum;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public Flat(byte roomsCount, double roomsArea ){
        this.roomNum = roomsCount;
        this.roomArea = roomsArea;
    }


}