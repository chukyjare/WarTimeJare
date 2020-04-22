package model;

import java.util.HashMap;

public class Matrix<K, E> {
	private int width, height;
	HashMap<E, K> keys = new HashMap<E, K>();
	HashMap<K, E> elements = new HashMap<K, E>();

	public Matrix(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public E setElement(K key, E element) {
		E put = elements.put(key, element);
		keys.put(element, key);
		return put;
	}

	public E getElement(K key) {
		return elements.get(key);
	}

	public K getKey(E element) {
		return keys.get(element);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
