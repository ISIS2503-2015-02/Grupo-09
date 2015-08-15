package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gusal on 15/08/2015.
 */
public enum Linea {

    A,
    B,
    C;

    private static Map<String, Linea> namesMap = new HashMap<String, Linea>(2);

    static {
        namesMap.put("A", A);
        namesMap.put("B", B);
        namesMap.put("C", C);
    }


    @JsonCreator
    public static Linea forValue(String value) {
        return namesMap.get(StringUtils.lowerCase(value));
    }

    @JsonValue
    public String toValue() {
        for (Map.Entry<String, Linea> entry : namesMap.entrySet()) {
            if (entry.getValue() == this)
                return entry.getKey();
        }

        return null;
    }
}
