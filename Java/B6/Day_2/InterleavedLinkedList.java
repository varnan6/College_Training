package B6.Day_2;

import java.util.LinkedList;

public class InterleavedLinkedList {

    static LinkedList<Integer> interleavedLL(LinkedList<Integer> ll) {

        LinkedList<Integer> res = new LinkedList<>();

        for (int i = 0; i < ll.size(); i += 2) {
            res.add(ll.get(i));
        }

        for (int i = 1; i < ll.size(); i += 2) {
            res.add(ll.get(i));
        }

        return res;
    }

    public static void main(String[] args) {

        LinkedList<Integer> res = new LinkedList<>();

        for (int i = 10; i <= 70; i += 10) {
            res.add(i);
        }

        res = interleavedLL(res);

        System.out.println(res);

    }
}