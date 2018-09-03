package org.example.assignment1;

public class Items {
    String Data;
    int Position;

    public Items(){

    }
    public Items(String given_Data){
        Data= given_Data;
    }
    public String getData() {
        return Data;
    }

    public int getPosition(){
        return Position;
    }
    public void setPosition(int position){
        Position = position;
    }
}
