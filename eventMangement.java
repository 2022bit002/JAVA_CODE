 //"Event Management System " aala hota
//Add event  eventname , date
//Display event

import java.util.*;

class Event{
	private String nameEvent;
	private String dateEvent;
	private String timeEvent;
	
	Event(String nameEvent , String dateEvent , String timeEvent){
		this.nameEvent = nameEvent;
		this.dateEvent = dateEvent;
		this.timeEvent = timeEvent;
	} 
	
	String getName(){
		return nameEvent;
	}
	
	String date(){
		return dateEvent;
	}
	
	String time(){
		return timeEvent;
	}
	
	public String toString(){
		return "EVENTS { Name : "+nameEvent+", Date : "+dateEvent+", Time : "+timeEvent+"}" ;
	}
}

class EventMangament{

	public static void main(String ...args){

	ArrayList<Event> evn = new ArrayList<>();
	EventMangament e = new EventMangament();
	
	Scanner s = new Scanner(System.in);
	
	int choice;
	do{
	
			System.out.println("Enter as per requirment");
			System.out.println("1 : to ADD");
			System.out.println("2 : to REMOVE");
			System.out.println("3 : to SEARCH");
			System.out.println("4 : to DISPLAY");
			System.out.println("5 : to EXIST");
			
		        choice = s.nextInt();
		        
		        switch (choice){
		        	case 1:
					System.out.println("adding an Event :");
					System.out.println("Enter the name :");
					String nameEvent = s.nextLine();
					nameEvent= s.nextLine();
					System.out.println("Enter the date as ddmmyyy:");
					String dateEvent = s.next();
					System.out.println("Enter the time as hh_mm :");
					String timeEvent = s.next();
					evn.add(new Event(nameEvent , dateEvent , timeEvent));
					break;
		        	
		        	case 2: 
					System.out.println("Enter the Event name to be removed");
					String eventDel = s.next();
					try{
					for (Event en : evn){
						if (en.getName().equals(eventDel)){
							evn.remove(en);
						}
					}
					}
					
					catch(Exception ex){}
					
					
					break;
		        	
		        	case 3: System.out.println("Enter the Event name to be removed");
					String eventSer = s.next();
					for (Event en : evn){
						if (en.getName().equals(eventSer)){
						System.out.println(en);
						}
					
					}
					break;
		        	
		        	case 4: 
					System.out.println("Displaying all the EVENTS");
					for (Event en : evn){
						System.out.println(en);
					}
					
					break;
					
					
			 	case 5:
					break;
					
				default :
					System.out.println("you have choosen wrong answer");	
		        	}
		        
		        
		}while(choice != 5);
		
	}	
}	

