package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track{
	
	public List<Artist> collaborators;

	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> collaborators) {
		super(artist,name, duration);
		this.collaborators = collaborators;
	}
	
	
	public String getFullArtistName() {
		List<String> collaboratorsList = new ArrayList<>();
		String collaboratorString;
		for (Artist collaborator: this.collaborators) {
			collaboratorsList.add(collaborator.getName());
		}
		collaboratorString = String.join(",", collaboratorsList);
		return getArtist().getName() +"(feat." + collaboratorString + ")";

		
	}

	
}

