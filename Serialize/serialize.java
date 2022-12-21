package Serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class employee implements Serializable {
    private String name;
    private String designation;
    private int age ;
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class serialize {
    public static void main(String[] args) {
        employee emp1 = new employee();
        emp1.setAge(19);
        emp1.setDesignation("designation");
        emp1.setName("Dhanush");
        File file1 = new File("C:\\Users\\admin\\Desktop\\Dhanush\\java\\Serialize\\file.ser");
        FileOutputStream fout = null ;
        ObjectOutputStream oOut = null;
        try {
            fout = new FileOutputStream(file1);
            oOut = new ObjectOutputStream(fout);
            oOut.writeObject(emp1);
        } catch (Exception e) {
            System.out.println("Error is :"+e);
        }
        
    }
}
