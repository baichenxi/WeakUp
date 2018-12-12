package com.example.a15109.wakeup;


public class Item{
    String Time;
    String Text;
    int Type;   //0 单机，1关联

    public Item(String Time, String Text, int Type) {
        this.Time = Time;
        this.Text = Text;
        this.Type = Type;
    }

    public void SetItemSingle(String Time, String Text, int Type) {
        this.Time = Time;
        this.Text = Text;
        this.Type = Type;
    }

    public String getTime() {
        return this.Time;
    }

    public String getText() {
        return this.Text;
    }

    public int getType() {
        return this.Type;
    }
}
