package visao;

public class HardDrive {
	
	private String read;
	
	private String write;

	
	//Construtor
	
	public HardDrive(String read, String write) {
		super();
		this.read = read;
		this.write = write;
	}
	
	
	
	public String read() {
			
			return "O HD est� fazendo a leitura do Sistemas";
			
		}
	
	public String write() {
		
		return "O write est� escrevendo os dados do HD";
		
	}
	
	
	

}
