package ex2;



public class RandomGenerator {
	private int previous;
    //private double next?;

    
    public RandomGenerator(){
    this.previous = 1;
    
    }
    
    public int random(){
    int next = ((this.previous * 25173) + 13849) % 65536;
    this.previous = next;
    return next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			RandomGenerator a= new RandomGenerator(); 
			System.out.println (a.random());
			System.out.println (a.random());
			System.out.println (a.random());

	}

}
