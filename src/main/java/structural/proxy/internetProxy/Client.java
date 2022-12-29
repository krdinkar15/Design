package structural.proxy.internetProxy;

public class Client {
    public static void main(String[] args) {
        Internet internet=new ProxyInternet();
        try {
            internet.connectTo("facebook.com");
            internet.connectTo("abc.com");
        }catch (Exception e)
        {
           e.printStackTrace();
        }
    }
}
