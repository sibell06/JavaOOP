package P06_GreedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bag {
    private long capacity;
    private Map<String, LinkedHashMap<String, Long>> contents;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.contents = new LinkedHashMap<>();

    }

    public boolean addItem(Item item) {
        if (!item.isValid()) {
            return false;

        }
        long totalAmount = getTotalAmount();
        if (totalAmount + item.getQuantity() > capacity) return false;

        switch (item.getType()) {
            case "Gem":
                if (!canAddGem(item.getQuantity())) return false;
                break;
            case "Cash":
                if (!canAddCash(item.getQuantity())) return false;
                break;
        }

        contents.putIfAbsent(item.getType(), new LinkedHashMap<>());
        LinkedHashMap<String, Long> itemsOfType = contents.get(item.getType());
        itemsOfType.put(item.getName(), itemsOfType.getOrDefault(item.getName(), 0L) + item.getQuantity());

        return true;
    }

    private boolean canAddCash(long quantity) {
        long gems = getTotal("Gem");
        long cash = getTotal("Cash");
        return gems >= cash + quantity;
    }

    private boolean canAddGem(long quantity) {
        long gold = getTotal("Gold");
        long gems = getTotal("Gem");
        return gold >= gems + quantity;
    }

    private long getTotal(String type) {
        return contents.getOrDefault(type, new LinkedHashMap<>())
                .values().stream().mapToLong(Long::longValue).sum();
    }

    private long getTotalAmount() {
        return contents.values().stream()
                .flatMap(m -> m.values().stream())
                .mapToLong(Long::longValue).sum();
    }

    public void printContents() {
        contents.entrySet().stream()
                .sorted((a, b) -> Long.compare(
                        getTotal(b.getKey()), getTotal(a.getKey())))
                .forEach(entry -> {
                    String type = entry.getKey();
                    long total = getTotal(type);
                    System.out.printf("<%s> $%d%n", type, total);

                    entry.getValue().entrySet().stream()
                            .sorted(Map.Entry.<String, Long>comparingByKey().reversed())
                            .forEach(item -> System.out.printf("##%s - %d%n", item.getKey(), item.getValue()));
                });
    }
}
