package com.timesheet.model.helper;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;


public class LocalDateDeserializer extends JsonDeserializer<LocalDate> {
	public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    @Override
    public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return LocalDate.parse(p.getValueAsString(), FORMATTER);
    }
}


//public class LocalDateSerializer extends JsonSerializer<LocalDate> {
//@Override
//public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
//  gen.writeString(value.format(FORMATTER));
//}
//}