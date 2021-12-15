package dades;

public class Recurs {
	
	private String nom;
	private LlistaConsultes llistaConsultes;
	private String[] diccionariUsuaris;
	
	public Recurs(String nom) {
		this.nom = nom;
	}
	
	public boolean afegirConsulta(String usuari, Temps tempsConsulta) {
		
	}
	
	private class LlistaConsulta {
		
		private Consulta[] consultes;
		private int nElem;
		
		public LlistaConsulta (int mida) {
			consultes = new Consulta[mida];
			nElem = 0;
		}
		
		public void afegirConsulta(Consulta consulta) {
			for(int i = 0; i < nElem; i++) {
				if(consultes[i].getTemps().compareTo(consulta.getTemps()) == 1) {
					
				}
			}
		}
		
	}
	
	private class Consulta {
		
		private String aliesUsuari;
		private Temps temps;
		
		public Consulta (String aliesUsuari, Temps temps) {
			this.aliesUsuari = aliesUsuari;
			this.temps = temps;
		}

		public String getAliesUsuari() {
			return aliesUsuari;
		}

		public void setAliesUsuari(String aliesUsuari) {
			this.aliesUsuari = aliesUsuari;
		}

		public Temps getTemps() {
			return temps;
		}

		public void setTemps(Temps temps) {
			this.temps = temps;
		}
		
	}
	
	private record Temps(Data data, Hora hora) implements Comparable<Temps>{
		@Override
		public int compareTo(Temps temps) {
			int dataCmp = data().compareTo(temps.data());
			if (dataCmp != 0) return dataCmp; 
			
			// Dates iguals, comparar hores
			return hora().compareTo(temps.hora());
			
			////En cas de no utilitzar la interface Comparable<Temps>
			//if (!(data().esDataInferiorOigual(temps.data()))) {
			//	return 1;
			//} else if (data().equals(temps.data())){
			//	// Comparar hora
			//	return 0;
			//} else {
			//	return -1;
			//}
		}
	}
	
	
}
