package org.openlmis.rearchpoc.reference.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import javax.validation.constraints.NotNull;

public class ExtraDataConverter implements AttributeConverter<Object, String> {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    @NotNull
    public String convertToDatabaseColumn(@NotNull Object extraData) {
        try {
            return objectMapper.writeValueAsString(extraData);
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    @NotNull
    public Object convertToEntityAttribute(@NotNull String databaseDataAsJSONString) {
        try {
            if (databaseDataAsJSONString.equalsIgnoreCase("null")) {
                return null;
            } else {
                return objectMapper.readValue(databaseDataAsJSONString, Object.class);
            }
        } catch (Exception ex) {
            return null;
        }
    }
}
