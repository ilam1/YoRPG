//Team JIM (Jeffrey Weng, Irene Lam, Mark Shafran)
//Irene Lam
//APCS1 pd5
//HW#32: Ye Olde Role Playing Game, Expanded
//2016-11-20

public class Mage extends Character {
    /* Default constructor
       Precondition: Instance variables declared
       Postcondition: Initializes instance variables of Character (with the exception of name) */
    public Mage(){
	_hitPts = 90;
	_strength = 80;
	_defense = 30;
	_attack = 1;
    }

    /*Overloaded constructor
      Precondition: Instance variable _name declared
      Postcondition: Initializes instance variable _name */    
    public Mage(String name){
	this();
	_name = name;
    }
    
    //Describes the characteristics and stats	
    public String about() {
	    return "Mages use magic. Stats:\nHP: " + _hitPts+"\nStrength: " + _strength+"\nDefense: " + _defense+"\nAttack: " + _attack;
    }
    //Mage's special attack
    public void specialize() {
	//    	System.out.println(_attack);
	//    	System.out.println(_defense);
	_strength *= 1.25;
	
    }

    //revert to normal mode
    public void normalize() {
	_strength = 80;
	_defense = 30;
    }
}
