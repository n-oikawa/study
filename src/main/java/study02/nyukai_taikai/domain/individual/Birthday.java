package study02.nyukai_taikai.domain.individual;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class Birthday {

    private final LocalDate value;

    public String getStringValue() {
        return value.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public boolean isTwentyYearsOld() {

        return ChronoUnit.YEARS.between(value, LocalDate.now()) >= 20;
    }
}
