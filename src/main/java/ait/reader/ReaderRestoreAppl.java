package ait.reader;

import ait.reader.dto.ReaderDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReaderRestoreAppl {
    static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }


    public static void main(String[] args) throws IOException {
        List<ReaderDto> readers = mapper.readValue(new File("readers.json"), new TypeReference<List<ReaderDto>>() {
        });
        for (ReaderDto reader : readers) {
            System.out.println(reader);
        }
    }
}

