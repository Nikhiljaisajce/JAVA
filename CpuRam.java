class Cpu{
	float price;
	class Processor{
		float cores=51;
		String manufacturer="Intel";
	}
	static class Ram
	{
		static float memory=512;
		String m_manufacturer="Asus";
	}
}

public class CpuRam{
	
	public static void main(String[] args){
		Cpu MyCpu = new Cpu();  
		Cpu.Processor MyProcessor = MyCpu.new Processor();		
		Cpu.Ram MyRam = new Cpu.Ram();
		System.out.println("Processor core = " + MyProcessor.cores);
		System.out.println("Processor manufacture = " + MyProcessor.manufacturer);
		System.out.println("Ram memory = " + Cpu.Ram.memory);
		System.out.println("Ram manufacturer = " + MyRam.m_manufacturer);
	}
}