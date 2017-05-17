package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

	private static Map<Nationality, List<Color>> FLAGS = new HashMap<Nationality, List<Color>>();
	
	static {
		FLAGS.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.GERMAN, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.BELGIAN, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.FRENCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.ITALIAN, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.ROMANIA, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.IRELAND, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.BULGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.RUSSIA, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
		FLAGS.put(Nationality.UNCLASSIFIED, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
	}
	
    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result = FLAGS.get(nationality);
        return result != null ? result : Arrays.asList(Color.GRAY);
    }
    // end::getFlag[]
}