package visao;

public class Memoria {
	
	private String memoriaRam;
	private String load;
	private String free;
	
	
	//Construtor
	
	public Memoria(String memoriaRam,String load, String free) {
		super();
		this.memoriaRam = memoriaRam;
		this.load = load;
		this.free = free;
	}
	
	
	public String memoriaRam() {
		
		return "A memoria est� sendo usada";
		
	}
	
	public String load() {
			
			return "PC est� load";
		}
		
		public String free() {
			
			return "PC est� em free";
		}
	
	
	

}
