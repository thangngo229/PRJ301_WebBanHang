/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.Cart;
import Models.Category;
import Models.Color;
import Models.Product;
import Models.Size;
import Models.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class DAO {

    private Connection con;
    private String status;

    public DAO() {
        try {
            con = new DBContext().getConnection();
        } catch (Exception e) {
            status = "Error at Connection " + e.getMessage();
        }
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "SELECT *  FROM [dbo].[Category_HE172128]";
        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category c = new Category(rs.getInt(1), rs.getString(2));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
        return list;
    }

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM [dbo].[Product_HE172128]";
        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setProductName(rs.getString(2));
                p.setDescription(rs.getString(3));
                p.setPrice(rs.getFloat(4));
                p.setCategoryID(rs.getInt(5));
                p.setSizeID(rs.getInt(6));
                p.setColorID(rs.getInt(7));
                p.setImage(rs.getString(8));
                p.setQuantity(rs.getInt(9));
                list.add(p);
            }
        } catch (Exception e) {

        }
        return list;
    }

    public List<Product> getProductByCateID(int id) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT [ProductID]\n"
                + "      ,[ProductName]\n"
                + "      ,[Description]\n"
                + "      ,[Price]\n"
                + "      ,[CategoryID]\n"
                + "      ,[SizeID]\n"
                + "      ,[ColorID]\n"
                + "      ,[Image]\n"
                + "      ,[Quantity]\n"
                + "  FROM [dbo].[Product_HE172128]\n"
                + "  where CategoryID = " + id;
        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setProductName(rs.getString(2));
                p.setDescription(rs.getString(3));
                p.setPrice(rs.getFloat(4));
                p.setCategoryID(rs.getInt(5));
                p.setSizeID(rs.getInt(6));
                p.setColorID(rs.getInt(7));
                p.setImage(rs.getString(8));
                p.setQuantity(rs.getInt(9));
                list.add(p);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public Product getProductByID(int id) {
        String query = "SELECT [ProductID]\n"
                + "      ,[ProductName]\n"
                + "      ,[Description]\n"
                + "      ,[Price]\n"
                + "      ,[CategoryID]\n"
                + "      ,[SizeID]\n"
                + "      ,[ColorID]\n"
                + "      ,[Image]\n"
                + "      ,[Quantity]\n"
                + "  FROM [dbo].[Product_HE172128]\n"
                + "  where ProductID = " + id;
        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setProductName(rs.getString(2));
                p.setDescription(rs.getString(3));
                p.setPrice(rs.getFloat(4));
                p.setCategoryID(rs.getInt(5));
                p.setSizeID(rs.getInt(6));
                p.setColorID(rs.getInt(7));
                p.setImage(rs.getString(8));
                p.setQuantity(rs.getInt(9));
                return p;
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Product> getAllProductOrderby(String UpDown) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM [dbo].[Product_HE172128] ORDER BY PRICE " + UpDown;
        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setProductName(rs.getString(2));
                p.setDescription(rs.getString(3));
                p.setPrice(rs.getFloat(4));
                p.setCategoryID(rs.getInt(5));
                p.setSizeID(rs.getInt(6));
                p.setColorID(rs.getInt(7));
                p.setImage(rs.getString(8));
                p.setQuantity(rs.getInt(9));
                list.add(p);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Product> searchByName(String name) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM [dbo].[Product_HE172128] WHERE [ProductName] LIKE ?";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, "%" + name + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setProductName(rs.getString(2));
                p.setDescription(rs.getString(3));
                p.setPrice(rs.getFloat(4));
                p.setCategoryID(rs.getInt(5));
                p.setSizeID(rs.getInt(6));
                p.setColorID(rs.getInt(7));
                p.setImage(rs.getString(8));
                p.setQuantity(rs.getInt(9));
                list.add(p);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Color> getColor() {
        List<Color> list = new ArrayList<>();
        String query = "SELECT *  FROM [dbo].[Color_HE172128]";
        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Color c = new Color(rs.getInt(1), rs.getString(2));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
        return list;
    }

    public List<Size> getSizes() {
        List<Size> list = new ArrayList<>();
        String query = "SELECT *  FROM [dbo].[Size_HE172128]";
        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Size s = new Size(rs.getInt(1), rs.getString(2));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
        return list;
    }

    public Users login(String username, String pass) {
        String sql = "SELECT [Username], [Password], [Address], [Email], [FullName], [Phone], [Role] "
                + "FROM [dbo].[User_HE172128] "
                + "WHERE Username = ? AND Password = ?";

        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Users u = new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                rs.close();
                st.close();
                return u;
            } else {
                rs.close();
                st.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteProduct(int id) {
        String sql = "DELETE FROM [dbo].[Product_HE172128] WHERE ProductID = ?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            int rowsAffected = st.executeUpdate(); // Thực hiện truy vấn DELETE và lấy số hàng bị ảnh hưởng
            if (rowsAffected > 0) {
                System.out.println("Xóa sản phẩm thành công");
            } else {
                System.out.println("Không tìm thấy sản phẩm có ID " + id + " để xóa.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addProduct(String name, String des, float price, int cate, int size, int color, String image, int quantity) {
        String sql = "INSERT INTO [dbo].[Product_HE172128] "
                + "([ProductName], [Description], [Price], [CategoryID], [SizeID], [ColorID], [Image], [Quantity]) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, des);
            st.setFloat(3, price);
            st.setInt(4, cate);
            st.setInt(5, size);
            st.setInt(6, color);
            st.setString(7, image);
            st.setInt(8, quantity);
            int rowsAffected = st.executeUpdate(); // Thực hiện truy vấn DELETE và lấy số hàng bị ảnh hưởng

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateProduct(String name, String des, float price, int cate, int size, int color, String image, int quantity, int productid) {
        String sql = "UPDATE [dbo].[Product_HE172128] "
                + "SET ProductName = ?, "
                + "    Description = ?, "
                + "    Price = ?, "
                + "    CategoryID = ?, "
                + "    SizeID = ?, "
                + "    ColorID = ?, "
                + "    Image = ?, "
                + "    Quantity = ? "
                + "WHERE ProductID = ?";

        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, des);
            st.setFloat(3, price);
            st.setInt(4, cate);
            st.setInt(5, size);
            st.setInt(6, color);
            st.setString(7, image);
            st.setInt(8, quantity);
            st.setInt(9, productid);
            int rowsAffected = st.executeUpdate(); // Thực hiện truy vấn DELETE và lấy số hàng bị ảnh hưởng

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Cart> getCart() {
        List<Cart> list = new ArrayList<>();
        String query = "SELECT [CartID], [ProductID], [Quantity], [Price] FROM [dbo].[ShoppingCart_HE172128]";
        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Cart c = new Cart(rs.getInt("CartID"), null, rs.getInt("ProductID"), rs.getInt("Quantity"), rs.getFloat("Price"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }

    public List<Product> listCart() {
        List<Cart> list = getCart();
        List<Product> listp = new ArrayList<>();
        for (Cart c : list) {
            int pid = c.getProductID();
            Product p = getProductByID(pid);
            listp.add(p);
        }
        return listp;
    }

    public void addCart(String name, int pid, int quantity, float price) {
        String sql = "INSERT INTO [dbo].[ShoppingCart_HE172128] "
                + "([Username], [ProductID], [Quantity], [Price]) "
                + "VALUES (?, ?, ?, ?)";
        try ( PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, name);
            st.setInt(2, pid);
            st.setInt(3, quantity);
            st.setFloat(4, price);

            int rowsAffected = st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Product> searchProductBycolor(int id) {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT [ProductID]\n"
                + "      ,[ProductName]\n"
                + "      ,[Description]\n"
                + "      ,[Price]\n"
                + "      ,[CategoryID]\n"
                + "      ,[SizeID]\n"
                + "      ,[ColorID]\n"
                + "      ,[Image]\n"
                + "      ,[Quantity]\n"
                + "  FROM [dbo].[Product_HE172128]\n"
                + "  where ColorID = ?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt(1));
                p.setProductName(rs.getString(2));
                p.setDescription(rs.getString(3));
                p.setPrice(rs.getFloat(4));
                p.setCategoryID(rs.getInt(5));
                p.setSizeID(rs.getInt(6));
                p.setColorID(rs.getInt(7));
                p.setImage(rs.getString(8));
                p.setQuantity(rs.getInt(9));
                list.add(p);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        DAO d = new DAO();
        d.addCart("user1", 18, 2, 100);
    }

}
