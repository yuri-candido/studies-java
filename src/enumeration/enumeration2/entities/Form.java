package src.enumeration.enumeration2.entities;

public class Form {

    enum Gender {
        FEMININE('F'), MASCULINE('M');

        private char value;

        Gender(char value){
            this.value = value;
        }
    }

    private String name;
    private Gender gender;

}
