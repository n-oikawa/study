package study02.nyukai_taikai.domain.individual;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import study02.nyukai_taikai.domain.SystemDate;

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

    public boolean isTwentyYearsOld(SystemDate systemDate) {
        return ChronoUnit.YEARS.between(value, systemDate.getValue()) >= 20;
    }
}
