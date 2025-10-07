package homework.homework7;

public class DynamicArrayDemo {
	public static void main(String[] args) {
		DynamicArray dynamicArray = new DynamicArray();
		dynamicArray.add(11);
		dynamicArray.add(13);
		dynamicArray.add(17);
		dynamicArray.add(2, 70);
		dynamicArray.set(3, 44);
		System.out.println(dynamicArray.getIndexByValue(13));
		System.out.println(dynamicArray.getByIndex(1));
		dynamicArray.deleteByIndex(2);
		System.out.println(dynamicArray.exists(12));
		dynamicArray.print();
	}
}