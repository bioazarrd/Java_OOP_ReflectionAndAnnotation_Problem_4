package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.core.CommandInterpreterImpl;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.core.Engine;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.core.factories.UnitFactoryImpl;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.data.UnitRepository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Repository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Runnable;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(new CommandInterpreterImpl(unitFactory, repository));
        engine.run();
    }



}
