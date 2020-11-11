package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.core.commands;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Inject;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Repository;

public class ReportCommand extends Command {


    @Inject
    private Repository repository;

    public ReportCommand() {

    }




    @Override
    public String execute() {
        return this.repository.getStatistics();
    }
}
