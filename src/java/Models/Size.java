/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author admin
 */
public class Size {
    private int SizeID;
    private String SizeName;

    public Size() {
    }

    public Size(int SizeID, String SizeName) {
        this.SizeID = SizeID;
        this.SizeName = SizeName;
    }

    public int getSizeID() {
        return SizeID;
    }

    public void setSizeID(int SizeID) {
        this.SizeID = SizeID;
    }

    public String getSizeName() {
        return SizeName;
    }

    public void setSizeName(String SizeName) {
        this.SizeName = SizeName;
    }

    @Override
    public String toString() {
        return "Size{" + "SizeID=" + SizeID + ", SizeName=" + SizeName + '}';
    }
    
    
}
