package exe2.test5;

import java.io.*;

/**
 * @Author zyh
 * @Date 2022/4/18 2:08 下午
 * @Version 1.0
 */
public class Resume implements Cloneable, Serializable {
    private static final long serializableId = 21232323L;

    private String name;
    private int age;
    private Photo photo;

    public Resume(String name, int age, Photo photo) {
        this.name = name;
        this.age = age;
        this.photo = photo;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", photo=" + photo +
                '}';
    }

    public Resume clone(){
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Resume) obj;
    }

    public Resume deepClone(){
        Object obj = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            obj = ois.readObject();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (Resume) obj;
    }
}
