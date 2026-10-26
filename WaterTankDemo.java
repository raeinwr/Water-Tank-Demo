    class WaterTank {
    private String name;
    private int[] buckets;
    private int top;

    public WaterTank(){
        this.name = "Water Tank ni Ren";
        this.buckets = new int[5];
        this.top = -1;
        System.out.println(name + " created no-argument constructor.");
    }

    public WaterTank (String name, int capacity){
        this.name = name;
        this.buckets = new int[capacity];
        this.top = -1;
        System.out.println( name + ": holds " + capacity + " buckets.");
    }
    public void pour (int liters){
        if (top == buckets.length -1) {
            System.out.println("Water is overflowing at " + name + ", " + liters + "L, turn off the water.");
            return;
        }
        top++;
        buckets[top] = liters;
        System.out.println("Poured " + liters + "L into " + name);
    }

    public int drain() {
        if (isEmpty()){
            System.out.println("UNDERFLOW!" + name + " is empty.");
            return 0;
        }
        int liters = buckets[top];
        System.out.println("U drained " + liters + "L of water");
        top--;
        return liters;
    }
    public int checkTop(){
        if (isEmpty()){
            System.out.println(name + " is empty.");
            return 0;
        }
        return buckets[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public int bucketCount(){
        return top + 1;
    }
    public int totalLiters(){
        int total = 0;
        for (int i = 0; i <= top; i++){
            total += buckets[i];
        }
        return total;
    }
}

public class WaterTankDemo {
    public static void main(String[] args) {
        WaterTank tank1 = new WaterTank();
        tank1.pour(9);
        tank1.pour(10);
        tank1.pour(20);
        System.out.println("Top Bucket: " + tank1.checkTop() + "L");
        tank1.drain();
        System.out.println("Buckets left: " + tank1.bucketCount() + " | Total Water: " + tank1.bucketCount());

        WaterTank tank2 = new WaterTank("Tank ni Tine", 3);
            tank2.pour(4);
            tank2.pour(10);
            tank2.pour(19);
            tank2.drain();
            tank2.drain();
            tank2.drain();
            System.out.println("Is the tank empty? " + (tank2.isEmpty() ? "Yes iii ateh??" : "No po work po muna!!"));
        }
    }
