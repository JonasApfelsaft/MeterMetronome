package application;

public class MeterMetronome {

	// Constructor
	public MeterMetronome() {
	}
	
	// method for Iambic: unstressed followed by stressed syllable
	public int[] getIambic(int stressedSyllables){	
		int[] verse = new int[stressedSyllables*2];
		for(int i = 0; i < verse.length; i++) {
			// even index like 0, 2, 4
			// array is filled with 0, which means syllable is not stressed
			if(i%2 == 0) {
				verse[i] = 0;
			}
			// uneven index like 1, 3, 5
			// array is filled with 1, which means syllable is stressed
			else {
				verse[i] = 1;
			}
		}
		return verse;
	}
	
	// method for Trochaic: stressed followed by unstressed syllable
	public int[] getTroachic(int stressedSyllables){	
		int[] verse = new int[stressedSyllables*2];
		for(int i = 0; i < verse.length; i++) {
			// even index like 0, 2, 4
			// array is filled with 1, which means syllable is stressed
			if(i%2 == 0) {
				verse[i] = 1;
			}
			// uneven index like 1, 3, 5
			// array is filled with 0, which means syllable is not stressed
			else {
				verse[i] = 0;
			}
		}
		return verse;
	}

	// method for Dactylic: stressed syllable followed by two unstressed syllables
		public int[] getDactylic(int stressedSyllables){	
			int[] verse = new int[stressedSyllables*3];
			for(int i = 0; i < verse.length; i++) {
				// index like 0, 3, 6, 9
				// array is filled with 1, which means syllable is stressed
				if(i%3 == 0) {
					verse[i] = 1;
				}
				// index like 1, 2, 4, 5, 7, 8
				// array is filled with 0, which means syllable is not stressed
				else {
					verse[i] = 0;
				}
			}
			return verse;
		}
		
		
		// method for Anapestic: two unstressed syllables followed by a stressed syllable
				public int[] getAnapestic(int stressedSyllables){	
					int[] verse = new int[stressedSyllables*3];
					for(int i = 0; i < verse.length; i++) {
						// index like 2, 5, 8
						// array is filled with 1, which means syllable is stressed
						if(i%3 == 0) {
							verse[i] = 1;
						}
						// index like 0, 1, 3, 4, 6, 7
						// array is filled with 0, which means syllable is not stressed
						else {
							verse[i] = 0;
						}
					}
					return verse;
				}
}