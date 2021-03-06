package pattern.pattern.strategy.roles.libai;

import pattern.pattern.strategy.Role;

/**
 *
 * @author ljx
 * @Date Feb 11, 2019 5:35:47 PM
 *
 */
public class RoleLiBai extends Role {
	
	private static final String NAME = Base.NAME;
	private static final int attack = Base.ATTACK;
	private static final int defense = Base.DEFENSE;
	
	public RoleLiBai() {
		super(NAME);
		this.setAttack1(new LiBaiAttack1())
			.setAttack2(new LiBaiAttack2())
			.setAttack3(new LiBaiAttack3())
//			.setAttack3(new NewLiBaiAttack3())// change his attack3 easily.
			.setNormalAttack(new LiBaiNormalAttack())
			.setAttack_value(attack)
			.setDefense_value(defense);
	}	
}
