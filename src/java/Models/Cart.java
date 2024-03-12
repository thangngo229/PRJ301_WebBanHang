/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author admin
 */
public class Cart {
    private int cartID;
    private String userName;
    private int productID;
    private int quantity;
    private float price;

    public Cart() {
    }

    public Cart(int cartID, String userName, int productID, int quantity, float price) {
        this.cartID = cartID;
        this.userName = userName;
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart{" + "cartID=" + cartID + ", userName=" + userName + ", productID=" + productID + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
    
    
    
}
