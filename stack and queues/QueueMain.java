public class QueueMain {
    public static void main(String[] args) throws Exception{
//        CustomQueue q = new CustomQueue();
//        q.insert(20);
//        q.insert(30);
//        q.insert(2);
//        System.out.println(q.remove());
//        q.display();
        CustomCircularQueue cq = new CustomCircularQueue();
        cq.insert(2);
        cq.insert(4);
        cq.insert(28);
        cq.insert(2);
        cq.display();
        System.out.println();
        System.out.println(cq.remove());
        cq.insert(128);
        cq.display();
    }
}
