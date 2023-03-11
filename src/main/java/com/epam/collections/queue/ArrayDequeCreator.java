package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> combinedCards = new ArrayDeque<>();
        combinedCards.add(firstQueue.remove());
        combinedCards.add(firstQueue.remove());
        combinedCards.add(secondQueue.remove());
        combinedCards.add(secondQueue.remove());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(combinedCards.removeLast());
            combinedCards.add(firstQueue.remove());
            combinedCards.add(firstQueue.remove());

            secondQueue.add(combinedCards.removeLast());
            combinedCards.add(secondQueue.remove());
            combinedCards.add(secondQueue.remove());
        }
        return combinedCards;
    }
}
