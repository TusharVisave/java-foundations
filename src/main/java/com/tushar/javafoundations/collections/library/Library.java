package com.tushar.javafoundations.collections.library;

import com.tushar.javafoundations.oop.library.LibraryItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {

    private final List<LibraryItem> items;
    private final Set<Integer> itemIds;
    private final Map<Integer, LibraryItem> itemsById;

    public Library() {
        this.items = new ArrayList<>();
        this.itemIds = new HashSet<>();
        this.itemsById = new HashMap<>();
    }

    public void addItem(LibraryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Library item cannot be null");
        }

        if (!itemIds.add(item.getItemId())) {
            throw new IllegalArgumentException(
                    "Item ID already exists: " + item.getItemId()
            );
        }

        items.add(item);
        itemsById.put(item.getItemId(), item);
    }

    public boolean removeItem(int itemId) {
        LibraryItem item = itemsById.remove(itemId);

        if (item == null) {
            return false;
        }

        itemIds.remove(itemId);
        items.remove(item);

        return true;
    }

    public LibraryItem findById(int itemId) {
        return itemsById.get(itemId);
    }

    public List<LibraryItem> getAllItems() {
        return List.copyOf(items);
    }

    public int size() {
        return items.size();
    }

    public boolean containsItem(int itemId) {
        return itemIds.contains(itemId);
    }
}