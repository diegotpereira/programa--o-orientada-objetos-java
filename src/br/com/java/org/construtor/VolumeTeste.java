package br.com.java.org.construtor;

public class VolumeTeste {
	
	public static void main(String[] args) {
			Volume volume = new Volume();
			volume.exibirVolume();

			Volume volume2 = new Volume(5, 10, 20);
			volume2.exibirVolume();
			volume2.exibirArea();
	}
}
