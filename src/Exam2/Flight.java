package Exam2;

public class Flight {
    int number;
    String destination;

    public Flight(int number, String destination) {
        try{
            if(number <= 0) {
                throw new Exception("The flight number should be positive-valued!");
            } else {
                this.number = number;
                this.destination = destination;
            }
        }catch (Exception e){

        }
    }

    public Flight() {
        this.number = 0;
        this.destination = " ";

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void display(){
        System.out.println(getNumber()+ " , "+getDestination());
    }
}
