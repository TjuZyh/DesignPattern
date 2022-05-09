package factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            //反射机制，通过类名创建实例
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到 " + classname + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    //使用抽象零件
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
