public class Boss extends Monster {
    public Boss() {
	super();
	_hitPts = 250;
	_strength = 50;
	_defense = 50;
	_attack = Math.random() + 0.1;
    }


}
