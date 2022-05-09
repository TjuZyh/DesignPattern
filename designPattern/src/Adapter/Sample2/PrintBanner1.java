public class PrintBanner1 extends Print1 {
    //使用委托，创建实例来实现目标方法
    private Banner1 banner;
    public PrintBanner1(String string) {
        this.banner = new Banner1(string);
    }
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
