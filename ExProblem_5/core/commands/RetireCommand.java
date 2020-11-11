package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.core.commands;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Inject;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Repository;

public class RetireCommand extends Command {

    @Inject
    private String[] data;
    @Inject
    private Repository repository;

    public RetireCommand() {
    }



    @Override
    public String execute() {
        String unitType = data[1];
        try {
            this.repository.removeUnit(unitType);
            return unitType + " retired!";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }


}
