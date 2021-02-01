package list.arraylist.implementation;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	public boolean addLast(Object element) {
		
		elementData[size] = element;
		size++;
		return true;
		
	}
	
	public boolean add(int index, Object element) {
		
//		for(int i=0;i>=a;i++){
//			elementData[size-i] = elementData[size-1-i]; 
//		}
		for(int i=size-1;i>=index;i--){
			elementData[i+1] = elementData[i];
		}
		
		elementData[index] = element;
		size++;
		return true;
	}

	public boolean addFirst(Object element) {

		return add(0, element);
	}

	@Override
	public String toString() {
		String str = "";
		str+="[";
		
		for(int i=0;i<size;i++){
			if(i==size-1){
				str+=elementData[i].toString();
				break;
			}
			str+=elementData[i].toString()+", ";
		}
		
		str+="]";
		return str;
	}
	
	
}
