package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.core.commands;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Inject;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Repository;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Unit;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.UnitFactory;

public class AddCommand extends Command {

    @Inject
    private String[] data;
    @Inject
    private UnitFactory factory;
    @Inject
    private Repository repository;


    public AddCommand() {

    }


    public String execute() {
        String unitType = this.data[1];;
        Unit unitToAdd = this.factory.createUnit(unitType);
        this.repository.addUnit(unitToAdd);
        return unitType + " added!";
    }
}
