public class Boss extends Monster {
    public Boss() {
	super();
	_hitPts = 200;
	_strength = 40;
	_defense = 50;
	_attack = Math.random() + 0.1;
    }


}
