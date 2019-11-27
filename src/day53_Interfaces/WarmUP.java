package day53_Interfaces;

/*
 
 Warmup:
    create an interface called Cars
            Actions: start()
    create an interface called ElectricVehicles
            Actions: Charge()
                     SelfDrive()
    create an interface called GasVehicles
            Actions: PumpGas()
    create classes:
            1. Tesla_Model3: 
                    implement Cars and  ElectricVehicles Interfaces
            2. Jeep_wrangler: 
                    implement Cars and GasVehicles Interfaces
            3. ToyotaHybird:
                    implement Cars, GasVehicles, and  ElectricVehicles Interfaces
                    
 */
public class WarmUP {

	public static void main(String[] args) {
		ToyotaHybrid t = new ToyotaHybrid();
		t.charge();
		t.pumpGas();
		t.pumpGas();
		t.selfDrive();
		
		System.out.println();
		
		GasVehicles obj = new Jeep();
		obj.pumpGas();
		//obj.start(); //start() method is not defined on GasVehicles interface
		
		Jeep j = new Jeep();
		j.pumpGas();
		j.start();
		
		
	}
	
	
}



class ToyotaHybrid implements Cars, GasVehicles, ElectricVehicles{

	@Override
	public void charge() {
		System.out.println("Toyota is using battery, when using gas it's charged");
		
	}

	@Override
	public void selfDrive() {
		System.out.println("Toyota can self drive");
	}

	@Override
	public void pumpGas() {
		System.out.println("Pump some gas, please! I need to charge battery");
	}

	@Override
	public void start() {
		System.out.println("vroom wroom vroom wroom");
		
	}
	
}

class Jeep implements Cars, GasVehicles{

	@Override
	public void pumpGas() {
		System.out.println("Out of gas, please, pump some gas! I'm Jeep");
		
	}

	@Override
	public void start() {
		System.out.println("wroom wroom vroom");
		
	}
	
}


class Tesla implements Cars, ElectricVehicles{

	@Override
	public void charge() {
		System.out.println("Tesla is Charging");
		
	}

	@Override
	public void selfDrive() {
		System.out.println("Tesla can self drive");
		
	}

	@Override
	public void start() {
		System.out.println("Tesla started vroom vroom");
	}
	
}


interface Cars{ //no need to use (abstract-public) keywords. They are by default with them
	void start();
}
interface ElectricVehicles{
	void charge();
	void selfDrive();
	
}
interface GasVehicles{
	void pumpGas();
}

