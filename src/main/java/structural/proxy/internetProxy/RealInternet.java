package structural.proxy.internetProxy;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connection to :"+serverhost);
    }
}
