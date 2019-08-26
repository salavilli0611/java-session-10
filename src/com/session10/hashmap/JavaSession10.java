package com.session10.hashmap;

import java.util.HashMap;
import java.util.Map;

import com.javagurs.session.javaclass.MovieMaking;

public class JavaSession10 {

	public static void main(String ar[]) {

		
		System.out.println("Java - Session - Hash Map");
		
		
		HashMap<String, String>  testHashMap = new HashMap<String, String>();
		
		testHashMap.put("learning", "java");
		testHashMap.put("learning1", "oracle");
		testHashMap.put("learning2", "springboot");
		testHashMap.put("learning", "JAVA");
		
		
		System.out.println(testHashMap.toString());
		
		HashMap<String, MovieMaking>  movieMarketing = new HashMap<String, MovieMaking>();
		
		
		 MovieMaking making  =  new MovieMaking("Robo Tamil", "LyCA","2019-12-12","VADI VELU , SANTHOSH"); 		 
		 movieMarketing.put("Robo-Tamil", making);
		
		 making  =  new MovieMaking("Robo Telgu", "LyCA","2019-12-12","Sampu , Ali"); 		 
		 movieMarketing.put("Robo-Telgu", making);
		
		 making  =  new MovieMaking("Robo Hindi", "LyCA","2019-12-12","Sampu , Ali"); 		 
		 movieMarketing.put("Robo-Hindi", making);
		
		 
		 System.out.println(movieMarketing.toString());
		 
		 System.out.println(movieMarketing.size());
			
		 
		 // when is this movie is gng to reelase and publish the details
		 
		 for(Map.Entry<String, MovieMaking> entry: movieMarketing.entrySet())
		 {
			 MovieMaking movie = entry.getValue();
			if(movie.getMovieName().equalsIgnoreCase("Robo Telgu"))
			{
				 System.out.println("Movie Name : " +movie.getMovieName()  + "   Release Date :" + movie.getReleaseDate());
			}
		 }
			 
		 
		 
		 
	}

}
