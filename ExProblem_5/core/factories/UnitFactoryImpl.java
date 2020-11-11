package D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.core.factories;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.Unit;
import D_JavaAdvancedOOP.Lecture7_ReflectionandAnnotations.ExProblem_5.interfaces.UnitFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"Draft.models.units.";




	@Override
	public Unit createUnit(String unitType) {
		try {
			Class<?> clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<?> ctor = clazz.getDeclaredConstructor();
			Object obj = ctor.newInstance();
			if (obj instanceof Unit) {
				return (Unit) obj;
			}
		} catch (ClassNotFoundException |
				NoSuchMethodException |
				IllegalAccessException |
				InstantiationException |
				InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
