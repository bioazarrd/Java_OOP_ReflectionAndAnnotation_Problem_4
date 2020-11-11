package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.models.units;

public class Gunner extends AbstractUnit {

    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;


    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }
}
