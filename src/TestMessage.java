import java.util.*;

public class TestMessage {
    public static void main(String[] args){
        List<Message> received = List.of(
                new Message(1, "Hello"),
                new Message(2, "发工资了吗"),
                new Message(2, "发工资了吗"),
                new Message(3, "去哪吃饭"),
                new Message(3, "去哪吃饭"),
                new Message(4, "Bye")
        );
        List<Message> displayMessages = process(received);
        for (Message message : displayMessages
             ) {
            System.out.println(message.text);
        }
    }
    static List<Message> process(List<Message> received){
        Set<Message> set = new HashSet<>(received);
        List<Message> list = new ArrayList<>(set);
        list.sort(Comparator.comparingInt(m -> m.sequence));
        return list;
    }
}
