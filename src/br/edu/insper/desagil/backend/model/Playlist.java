package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	public int id;
	public List<Track> tracks;
	public Map<String, Integer> ratings;
	public Playlist(int id, List<Track> tracks, Map<String, Integer> ratings) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}
	public int getId() {
		return id;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public Map<String, Integer> getRatings() {
		return ratings;
	}
	public void addTracks(Track track) {
		this.tracks.add(track);
	}
	public void putRating(String name, int rating) {
		this.ratings.put(name, rating);
	}
	
	public double averageRatings() {
		double average;
		int nRatings = 0;
		int totalRatings = 0;
		
		for (int rating : this.ratings.values()) {
			nRatings ++;
			totalRatings += rating;			
			
		}
		average = (double) totalRatings/nRatings;
		
		int averageInt = (int) average;
		double dot = average - averageInt;
		
		if (dot < 0.26) {
			return (double) averageInt;
		}
		else if(dot >=0.74) {
			return (double) averageInt+1;
		}
		else {
			return (double) averageInt+0.5;
		}
	}
}
