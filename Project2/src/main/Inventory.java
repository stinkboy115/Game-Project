package main;
import java.util.ArrayList;

public class Inventory {
	ArrayList<String> inventory = new ArrayList<String>();
	
	void checkInv(){
		System.out.print(NAME + " has ");
		if (inventory.size() <= 1) {
			if (inventory.size() == 1) {
				System.out.println(inventory.get(0) + ".");
			}
			else {
				System.out.println("nothing...");
			}
		}
		else {
			for(int i = 0; i < inventory.size()-2; i++) {
				System.out.print(inventory.get(i) + ", ");
			}
			System.out.print(inventory.get(inventory.size() - 2) + " and " + 
			inventory.get(inventory.size() - 1));
		}
	}
	
	void addItemToInv(String item){
		if(hasItem(item));
		else {
			inventory.add(item);
			System.out.println(item + " has been added to " + NAME + " /'s inventory");
		}
	}
	
	boolean hasItem(String item){
		for (int i = 0; i < inventory.size(); i++) {
			if (item.equals(inventory.get(i))){
				return true;
			}
		}
		return false;
	}
	
	void RemoveInventory(String item){
		inventory.remove(item);
	}
	void ClearInventory() {
		inventory.removeAll(inventory);
	}
}
