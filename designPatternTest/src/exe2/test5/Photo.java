package exe2.test5;

import java.io.Serializable;

/**
 * @Author zyh
 * @Date 2022/4/18 2:05 下午
 * @Version 1.0
 */
public class Photo implements Serializable {
    private static final long serializableId = 787887788L;

    private int size;

    public Photo(int size) {
        this.size = size;
    }

    public static long getSerializableId() {
        return serializableId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "size=" + size +
                '}';
    }
}
