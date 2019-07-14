class TwelveDays {

	String song="";

    String verse(int verseNumber) {
    	
    	String lyrics ="";
    
        String[] numArray = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
        
        lyrics = lyrics.concat("On the "+numArray[verseNumber-1]+" day of Christmas my true love gave to me: ");
        
        switch (verseNumber)
        {
            
            case 12:
                lyrics = lyrics.concat("twelve Drummers Drumming, ");
            case 11:
                lyrics = lyrics.concat("eleven Pipers Piping, ");
            case 10:
                lyrics = lyrics.concat("ten Lords-a-Leaping, ");
            case 9:
                lyrics = lyrics.concat("nine Ladies Dancing, ");
            case 8:
                lyrics = lyrics.concat("eight Maids-a-Milking, ");
            case 7:
                lyrics = lyrics.concat("seven Swans-a-Swimming, ");
            case 6:
                lyrics = lyrics.concat("six Geese-a-Laying, ");
            case 5:
                lyrics = lyrics.concat("five Gold Rings, ");
            case 4:
                lyrics = lyrics.concat("four Calling Birds, ");
            case 3:
                lyrics = lyrics.concat("three French Hens, ");
            case 2:
                lyrics = lyrics.concat("two Turtle Doves, and ");
            case 1:
            	lyrics = lyrics.concat("a Partridge in a Pear Tree.\n");
               break;
     
        }
        return lyrics;
    }

    
    String verses(int startVerse, int endVerse) {
        
        for (int i = startVerse;i <= endVerse ; i++ ) {
        	song = song.concat(verse(i));
            if(i!=endVerse)
                song = song.concat("\n");
        }
        return song;
    }
    
    
    String sing() {
        return verses(1,12);
    }
}