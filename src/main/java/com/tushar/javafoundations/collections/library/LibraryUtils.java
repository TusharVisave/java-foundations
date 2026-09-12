package com.tushar.javafoundations.collections.library;

import com.tushar.javafoundations.oop.library.LibraryItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class LibraryUtils {

    private LibraryUtils() {
    }

    public static <T extends LibraryItem> List<T> filterByType(
            List<T> items,
            String itemType
    ) {
        List<T> result = new ArrayList<>();

        for (T item : items) {
            if (item.getItemType().equalsIgnoreCase(itemType)) {
                result.add(item);
            }
        }

        return result;
    }

    public static <T extends LibraryItem> List<T> sortByTitle(
            List<T> items
    ) {
        List<T> sortedItems = new ArrayList<>(items);

        sortedItems.sort(
                Comparator.comparing(LibraryItem::getTitle)
        );

        return sortedItems;
    }

    public static <T extends LibraryItem> List<T> sortById(
            List<T> items
    ) {
        List<T> sortedItems = new ArrayList<>(items);

        sortedItems.sort(
                Comparator.comparingInt(LibraryItem::getItemId)
        );

        return sortedItems;
    }

    public static <T> List<T> createList(T... elements) {
        return List.of(elements);
    }
}