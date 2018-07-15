package rampe;

import java.util.ArrayList;

public class Centrala {
	private ArrayList<NaplatnaStanica> naplatneRampe = new ArrayList<NaplatnaStanica>();

	public ArrayList<NaplatnaStanica> getNaplatneRampe() {
		return naplatneRampe;
	}

	public void setNaplatneRampe(ArrayList<NaplatnaStanica> naplatneRampe) {
		this.naplatneRampe = naplatneRampe;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centrala other = (Centrala) obj;
		if (naplatneRampe == null) {
			if (other.naplatneRampe != null)
				return false;
		} else if (!naplatneRampe.equals(other.naplatneRampe))
			return false;
		return true;
	}

	// TODO: ISPIS CENTRALE
	
}
