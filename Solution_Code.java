public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;
    public Character(AttackStrategy attack, DefenseStrategy defense) {
        this.attackStrategy = attack;
        this.defenseStrategy = defense;
    }
    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }
    public void attack() {
        attackStrategy.attack();
    }
    public void defend() {
        defenseStrategy.defend();
    }
}

public interface AttackStrategy {
    public void attack();
}
public interface DefenseStrategy {
    public void defend();
}

public class CastSpell implements AttackStrategy {
  public void attack () {
    System.out.println("Wizard casts a spell!");
  }
}
public class ShootArrow implements AttackStrategy {
  public void attack () {
    System.out.println("Archer shoots an arrow!");
  }
}
public class SwingSword implements AttackStrategy {
  public void attack () {
    System.out.println("Knight attacks with a sword!");
  }
}

public class Shield implements DefenseStrategy {
  public void defend() {
    System.out.println("Using a shield to defend!");
  }
}
public class Dodge implements DefenseStrategy {
  public void defend() {
    System.out.println("Dodging to avoid attack!");
  }
}
public class CreateMagic implements DefenseStrategy {
  public void defend() {
    System.out.println("Creating a magic barrier for defense!");
  }
}
