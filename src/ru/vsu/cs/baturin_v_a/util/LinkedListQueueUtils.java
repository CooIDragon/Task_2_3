package ru.vsu.cs.baturin_v_a.util;

import ru.vsu.cs.baturin_v_a.LinkedListQueue;

public class LinkedListQueueUtils {

    public static LinkedListQueue<Integer> intArrayToList(int[] array) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int j : array) {
            queue.addElement(j);
        }
        return queue;
    }

    public static int[] intListToArray(LinkedListQueue<Integer> queue) throws Exception {
        int[] array = new int[queue.count()];
        for (int i = 0; i < array.length; i++) {
            array[i] = queue.removeElement();
        }
        return array;
    }
}