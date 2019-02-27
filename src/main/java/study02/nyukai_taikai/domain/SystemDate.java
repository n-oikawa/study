package study02.nyukai_taikai.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
@EqualsAndHashCode
public class SystemDate {

    @Getter
    private final LocalDate value;

}
