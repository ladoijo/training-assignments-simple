package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

	private static Map<Nationality, List<Color>> FLAGS = new HashMap<Nationality, List<Color>>();
	
	/*static {
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
	}*/
    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;
        switch (nationality) {
        case DUTCH:
            result = Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
            break;
        case GERMAN:
            result = Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
            break;
        case BELGIAN:
            result = Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
            break;
        case FRENCH:
            result = Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
            break;
        case ITALIAN:
            result = Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
            break;
        case ROMANIA:
            result = Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
            break;
        case IRELAND:
            result = Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
            break;
        case HUNGARIAN:
            result = Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
            break;
        case BULGARIAN:
            result = Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
            break;
        case RUSSIA:
        case UNCLASSIFIED:
        default:
            result = Arrays.asList(Color.GRAY);
            break;
        }
        return result;
    }
    // end::getFlag[]

}