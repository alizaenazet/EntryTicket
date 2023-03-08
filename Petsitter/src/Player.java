public class Player {
    private Dog pet;
    private String username;
    private int food_stock, money;
    
    //constructor
    public Player(){
        food_stock = 50;
        money = 100;
    }
    
    //getter setter
    public String getUsername(){
        return username;
    }
    
    public int getFoodStock(){
        return food_stock;
    }
    
    public int getMoney(){
        return money;
    }
    
    public Dog getPet(){
        return pet;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    //methods OR behaviours
    public void addDog(Dog abcPet){
        money = money - abcPet.getPrice();
        pet = abcPet;
    }
    
    public void dogDies(){
        pet = null;
    }
    
    public void sellDog(){
        money = money + pet.getPrice();
        pet = null;
    }
    
    public void foodStock(int am){
        food_stock = food_stock - am;
    }
}
