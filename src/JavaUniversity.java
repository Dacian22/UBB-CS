import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class JavaUniversity {
    public int round(int note)
    {
        int multiple = ((note / 5) + 1) * 5;
        if (note > 38) {
            if(multiple - note < 3) {
                return multiple;
            }
        }
        return note;
    }

    public ArrayList<Integer> insufficient_notes(int[] notes) throws Exception {
        if (notes.length == 0){
            throw new Exception("Array length 0");
        }
        ArrayList<Integer> insufficient_notes_array = new ArrayList<>();
        for(int i = 0; i< notes.length; i++){
            int note_rounded = this.round(notes[i]);
            if(note_rounded < 40){
                insufficient_notes_array.add(notes[i]);
            }
        }
        return insufficient_notes_array;
    }

    public float average_notes(int[] notes) throws Exception {
        if (notes.length == 0){
            throw new Exception("Array length 0");
        }
        int sum=0;
        for(int i = 0; i< notes.length; i++){
            sum+=notes[i];
        }
        return (float) sum / notes.length;
    }



    public ArrayList<Integer> rounded_notes(int[] notes) throws Exception {
        if (notes.length == 0){
            throw new Exception("Array length 0");
        }
        ArrayList<Integer> rounded_notes_array = new ArrayList<>();
        for(int i = 0; i< notes.length; i++){
            int note_rounded = this.round(notes[i]);
            rounded_notes_array.add(note_rounded);
        }
        return rounded_notes_array;
    }

    public int maxima_rounded_note(int[] notes) throws Exception {
        if (notes.length == 0){
            throw new Exception("Array length 0");
        }
        int max = 0;
        for(int i = 0; i< notes.length; i++){
            int note_rounded = this.round(notes[i]);
            if(note_rounded > max){
                max = note_rounded;
            }
        }
        return max;
    }

}
