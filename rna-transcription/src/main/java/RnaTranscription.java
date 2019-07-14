import java.util.HashMap; 
import java.util.Map;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        
        HashMap<Character,Character> map = new HashMap<>(); 
           
        map.put('G', 'C'); 
        map.put('C', 'G'); 
        map.put('T', 'A');
        map.put('A', 'U'); 


        StringBuilder rnaComplement = new StringBuilder();
        // String rnaComplement;

        for ( int i = 0; i < dnaStrand.length(); i++ ) {

            rnaComplement.append(map.get(dnaStrand.charAt(i)));

        }
        return rnaComplement.toString();
        
    }
}
