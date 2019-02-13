package study02;

import lombok.Getter;

import java.time.LocalDateTime;

public class Event {
    public int id;

    @Getter
    public LocalDateTime event_date_time;
}