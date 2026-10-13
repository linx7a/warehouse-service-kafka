package linx7a.warehouse_service;

public record Order(
        String orderId,
        String product,
        Integer quantity
) {
}
