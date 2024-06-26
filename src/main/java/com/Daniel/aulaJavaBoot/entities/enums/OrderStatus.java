package com.Daniel.aulaJavaBoot.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;//codigo do tipo enumerado
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus vale: OrderStatus.values()) {
			if (vale.getCode() == code) {
				return vale;
			}
		}
		throw new IllegalArgumentException("Invalide Order Status");
	}

}
