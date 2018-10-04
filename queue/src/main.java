
public class main {
	
	public static void main (String[] args)
	{
		
	
	
	
	
	
	Queue<Kunde> Snake = new Queue<Kunde>();
	
	
	
	
	
	Kunde Kunde1 = new Kunde("test");
    Kunde Kunde2 = new Kunde("est2");
	Kunde Kunde3 = new Kunde("test²");
	Kunde Kunde4 = new Kunde("testst³");
	Kunde Kunde5 = new Kunde("johnny");

	Kunde1.setName("nake");
	Kunde2.setName("make");
	Kunde3.setName("lake");
	Kunde4.setName("cake");
	Kunde5.setName("kake");
	
	
	
	Snake.enqueue(Kunde1);
	Snake.enqueue(Kunde2);
	Snake.enqueue(Kunde3);
	Snake.enqueue(Kunde4);
	Snake.enqueue(Kunde5);
	
	
	Snake.front();
	for(int i = 0; i < 5; i++) {
	System.out.println(Snake.front());
	
	Snake.dequeue();
	
	
	
	}
	
}
}