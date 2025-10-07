package homework.homework7;

public class DynamicArray {
	private int[] array = new int[10];
	private int size = 0;

	public void add(int value) {
		if (size == array.length) {
			extend();
		}
		array[size] = value;
		size++;
	}

	private void extend() {
		int[] newArray = new int[array.length + 10];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}

	public int getByIndex(int index) {
		if (index >= 0 && index < size) {
			return array[index];
		} else {
			return -1;
		}

	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void deleteByIndex(int index) {
		if (index < 0 || index >= size) {
			System.out.println("չկա նման էլեմենտ");
		} else {
			for (int i = 0; i < size - 1; i++) {
				array[index] = array[size - 1];
			}
		}
		size--;
	}

	public void set(int index, int value) {
		if (index < 0 || index >= size) {
			System.out.println("չկա նման էլեմենտ");
		} else {
			array[index] = value;
		}
	}

	public void add(int index, int value) {
		if (index < 0 || index > size) {
			System.out.println("չկա նման էլեմենտ");
		} else {
			for (int i = size; i > index; i--) {
				array[i] = array[i - 1];
			}
			array[index] = value;
			size++;
		}
	}

	public boolean exists(int value) {
		for (int i : array) {
			if (value == i) {
				return true;
			}
		}
		return false;
	}

	public int getIndexByValue(int value) {
		for (int i = 0; i < size; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}
}