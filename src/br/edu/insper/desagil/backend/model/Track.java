package br.edu.insper.desagil.backend.model;


public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getDurationString() {
		double divide = this.duration/60;
		int inteiro = (int) divide;
		double doub = divide - inteiro;
		int resto = 0;
		
		if (doub > 0.001) {
			resto = (int) (doub*60*0.1);
		}
		String inteiroString = Integer.toString(inteiro);
		String restonovo;
		if (resto<10) {
			restonovo = '0'+Integer.toString(resto);
		}
		else {
			restonovo = '0' + Integer.toString(resto);
		}
		return inteiroString + " : " + restonovo;
					
	}
	public String getFullArtistName(){
		return this.artist.getName();
	}
}
	
	
