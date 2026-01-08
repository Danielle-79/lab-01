package com.example.PetShop;
import java.util.Date;
public class Sad extends Mood{
    public Sad() {
        super();
    }
    public Sad(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Sad";
    }

}
