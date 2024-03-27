package ait.reader.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(of = "id")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class ReaderDto {
    private int id;
    @Setter  // Setter for the name
    private String name;
    private int birthYear;
    @Singular
    private Set<String> lovedBooks;

//    @JsonIgnore
    public String getMostLovedBook() {
     return lovedBooks.stream().findFirst().orElse("Call a back");
    }
}
