import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer;

public class ConsumerInterface  {
	
public static void main(String args[])
{
	
	Consumer<String>  consumer=(String a)->System.out.println(a);
	consumer.accept("Narmadha");
}
	

}
