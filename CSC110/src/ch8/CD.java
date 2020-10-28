package ch8;

public class CD extends Item
{
	
	//delcare variables
	private String artist = "unknown";
	private int numberOfTracks;
	
	//constructor methods
	public CD()
	{
		super();
		numberOfTracks = 0;
	}
	public CD(String theTitle, int time, String theArtist, int tracks) 
	{
		super(theTitle, time);
		artist = theArtist ;
		numberOfTracks = tracks;
	}
	
	public double calcAvgTrackTime() 
	{
		return (super.calcTimeInHrs() * 60) / numberOfTracks;
	}
	public String toString()
	{
		return(super.toString() + " artist: " + artist);
	}
	
	
	
	
	
	
}
