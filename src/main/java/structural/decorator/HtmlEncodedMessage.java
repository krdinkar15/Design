package structural.decorator;
// Decorator implements component Interface
public class HtmlEncodedMessage implements Message{
    private Message message;

    public HtmlEncodedMessage(Message msg)
    {
        this.message=msg;
    }
    @Override
    public String getContent() {
       return "Hii "+message.getContent();
    }
}
