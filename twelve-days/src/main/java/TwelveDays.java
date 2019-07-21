class TwelveDays {

    String song="";

    String verse(int verseNumber) {
        
        String lyrics ="";
    
        String[] day = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
        
        lyrics = lyrics.concat("On the "+day[verseNumber-1]+" day of Christmas my true love gave to me: ");

        String[] gifts = {
            "a Partridge in a Pear Tree.\n",
            "two Turtle Doves, and ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, "
        };

        for (int i = verseNumber - 1; i>=0 ; i-- ) {
            lyrics = lyrics.concat(gifts[i]);
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